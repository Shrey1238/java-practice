package practice.week3;

import java.util.ArrayList;
import java.util.List;

/**
 * Week 3, Part A: writing your own class.
 *
 * Design:
 *  - Fields are private. Everything goes through methods. (This is "encapsulation".)
 *  - Balance is stored in cents as a long, not a double, so money never has rounding errors.
 *  - Every deposit/withdrawal is appended to a transaction history.
 *
 * Rules:
 *  - deposit(amount):  amount must be > 0, else IllegalArgumentException
 *  - withdraw(amount): amount must be > 0, else IllegalArgumentException
 *                      amount must be <= balance, else InsufficientFundsException
 *  - transferTo(other, amount): withdraw from this, deposit into other. Same rules.
 *  - toString(): "Account[owner=Alice, balanceCents=1500]"
 */
public class BankAccount {

    private final String owner;
    private long balanceCents;
    private final List<String> history = new ArrayList<>();

    /** Creates an account with a zero balance. */
    public BankAccount(String owner) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Creates an account with a starting balance.
     *
     * @throws IllegalArgumentException if initialBalanceCents is negative
     */
    public BankAccount(String owner, long initialBalanceCents) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getOwner() {
        throw new UnsupportedOperationException("TODO");
    }

    public long getBalanceCents() {
        throw new UnsupportedOperationException("TODO");
    }

    /** History entries look like "DEPOSIT 500" or "WITHDRAW 200", oldest first. */
    public List<String> getHistory() {
        throw new UnsupportedOperationException("TODO");
    }

    public void deposit(long amountCents) {
        throw new UnsupportedOperationException("TODO");
    }

    public void withdraw(long amountCents) throws InsufficientFundsException {
        throw new UnsupportedOperationException("TODO");
    }

    public void transferTo(BankAccount other, long amountCents) throws InsufficientFundsException {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO");
    }
}
