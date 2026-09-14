package practice.week1;

/**
 * Week 1, Part A: primitives, conditionals, loops, methods.
 *
 * Replace each {@code throw new UnsupportedOperationException("TODO")} with your
 * implementation, then run {@code ./mvnw test -Dtest=BasicsTest} to check yourself.
 *
 * Rules for yourself:
 *  - No copy/paste. Type it.
 *  - Do not use streams or library helpers like Arrays.stream / Math.max in week 1.
 *    The point is to practise writing loops by hand.
 */
public class Basics {

    /** Returns true if n is even. Negative numbers count too (-4 is even). */
    public static boolean isEven(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns the sum of all elements. Empty array returns 0. */
    public static int sum(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns the largest element.
     *
     * @throws IllegalArgumentException if the array is empty
     */
    public static int max(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns the average as a double. Empty array returns 0.0. Watch out for integer division! */
    public static double average(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns n! (n factorial). 0! is 1. Use a loop, not recursion (that comes later).
     *
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns true if n is a prime number (only divisible by 1 and itself).
     * 0 and 1 are not prime. Negative numbers are not prime.
     */
    public static boolean isPrime(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Classic FizzBuzz for a single number:
     *  - divisible by 3 and 5 -> "FizzBuzz"
     *  - divisible by 3       -> "Fizz"
     *  - divisible by 5       -> "Buzz"
     *  - otherwise            -> the number as a String, e.g. "7"
     */
    public static String fizzBuzz(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Converts Celsius to Fahrenheit: F = C * 9/5 + 32. Careful with integer division again. */
    public static double celsiusToFahrenheit(double celsius) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns how many elements are greater than {@code threshold}. */
    public static int countGreaterThan(int[] numbers, int threshold) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns a new array with the elements in reverse order.
     * Do NOT modify the input array.
     */
    public static int[] reversed(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }
}
