package practice.week3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void newAccountStartsEmpty() {
        BankAccount a = new BankAccount("Alice");
        assertEquals("Alice", a.getOwner());
        assertEquals(0, a.getBalanceCents());
        assertEquals(List.of(), a.getHistory());
    }

    @Test
    void initialBalance() {
        BankAccount a = new BankAccount("Alice", 1500);
        assertEquals(1500, a.getBalanceCents());
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("Bob", -1));
    }

    @Test
    void depositAndWithdraw() throws InsufficientFundsException {
        BankAccount a = new BankAccount("Alice");
        a.deposit(500);
        a.deposit(250);
        a.withdraw(200);
        assertEquals(550, a.getBalanceCents());
        assertEquals(List.of("DEPOSIT 500", "DEPOSIT 250", "WITHDRAW 200"), a.getHistory());
    }

    @Test
    void rejectsNonPositiveAmounts() {
        BankAccount a = new BankAccount("Alice", 100);
        assertThrows(IllegalArgumentException.class, () -> a.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> a.deposit(-5));
        assertThrows(IllegalArgumentException.class, () -> a.withdraw(0));
        assertThrows(IllegalArgumentException.class, () -> a.withdraw(-5));
        assertEquals(100, a.getBalanceCents(), "balance must be unchanged after rejected operations");
        assertEquals(List.of(), a.getHistory(), "rejected operations must not be recorded");
    }

    @Test
    void overdraftThrows() {
        BankAccount a = new BankAccount("Alice", 100);
        assertThrows(InsufficientFundsException.class, () -> a.withdraw(101));
        assertEquals(100, a.getBalanceCents());
    }

    @Test
    void transfer() throws InsufficientFundsException {
        BankAccount a = new BankAccount("Alice", 1000);
        BankAccount b = new BankAccount("Bob");
        a.transferTo(b, 400);
        assertEquals(600, a.getBalanceCents());
        assertEquals(400, b.getBalanceCents());
        assertEquals(List.of("WITHDRAW 400"), a.getHistory());
        assertEquals(List.of("DEPOSIT 400"), b.getHistory());
    }

    @Test
    void failedTransferChangesNothing() {
        BankAccount a = new BankAccount("Alice", 100);
        BankAccount b = new BankAccount("Bob");
        assertThrows(InsufficientFundsException.class, () -> a.transferTo(b, 500));
        assertEquals(100, a.getBalanceCents());
        assertEquals(0, b.getBalanceCents());
    }

    @Test
    void historyIsACopy() {
        BankAccount a = new BankAccount("Alice");
        a.deposit(100);
        a.getHistory().clear();
        assertEquals(1, a.getHistory().size(), "getHistory() must return a copy, not the internal list");
    }

    @Test
    void toStringFormat() {
        assertEquals("Account[owner=Alice, balanceCents=1500]", new BankAccount("Alice", 1500).toString());
    }
}
