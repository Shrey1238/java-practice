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
        this(owner, 0);
    }

    /**
     * Creates an account with a starting balance.
     *
     * @throws IllegalArgumentException if initialBalanceCents is negative
     */
    public BankAccount(String owner, long initialBalanceCents) {
        if (initialBalanceCents < 0) {
            throw new IllegalArgumentException("initial balance must be >= 0");
        }
        this.owner = owner;
        this.balanceCents = initialBalanceCents;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalanceCents() {
        return balanceCents;
    }

    /** History entries look like "DEPOSIT 500" or "WITHDRAW 200", oldest first. */
    public List<String> getHistory() {
        return new ArrayList<>(history);
    }

    public void deposit(long amountCents) {
        if (amountCents <= 0) {
            throw new IllegalArgumentException("deposit must be positive");
        }
        balanceCents += amountCents;
        history.add("DEPOSIT " + amountCents);
    }

    public void withdraw(long amountCents) throws InsufficientFundsException {
        if (amountCents <= 0) {
            throw new IllegalArgumentException("withdrawal must be positive");
        }
        if (amountCents > balanceCents) {
            throw new InsufficientFundsException(
                    "cannot withdraw " + amountCents + " from balance " + balanceCents);
        }
        balanceCents -= amountCents;
        history.add("WITHDRAW " + amountCents);
    }

    public void transferTo(BankAccount other, long amountCents) throws InsufficientFundsException {
        withdraw(amountCents);
        other.deposit(amountCents);
    }

    @Override
    public String toString() {
        return "Account[owner=" + owner + ", balanceCents=" + balanceCents + "]";
    }
}
