package practice.week3;

/**
 * A "checked" exception: callers of withdraw() are forced to handle it (try/catch or throws).
 * Compare with IllegalArgumentException, which is "unchecked" — callers may ignore it.
 * Class rule of thumb: checked = "expected, recoverable situation", unchecked = "programmer bug".
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
