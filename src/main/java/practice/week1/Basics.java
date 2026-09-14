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
        return n % 2 == 0;
    }

    /** Returns the sum of all elements. Empty array returns 0. */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    /**
     * Returns the largest element.
     *
     * @throws IllegalArgumentException if the array is empty
     */
    public static int max(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }
        int best = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > best) {
                best = numbers[i];
            }
        }
        return best;
    }

    /** Returns the average as a double. Empty array returns 0.0. Watch out for integer division! */
    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        return (double) sum(numbers) / numbers.length;
    }

    /**
     * Returns n! (n factorial). 0! is 1. Use a loop, not recursion (that comes later).
     *
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Returns true if n is a prime number (only divisible by 1 and itself).
     * 0 and 1 are not prime. Negative numbers are not prime.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Classic FizzBuzz for a single number:
     *  - divisible by 3 and 5 -> "FizzBuzz"
     *  - divisible by 3       -> "Fizz"
     *  - divisible by 5       -> "Buzz"
     *  - otherwise            -> the number as a String, e.g. "7"
     */
    public static String fizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }

    /** Converts Celsius to Fahrenheit: F = C * 9/5 + 32. Careful with integer division again. */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    /** Returns how many elements are greater than {@code threshold}. */
    public static int countGreaterThan(int[] numbers, int threshold) {
        int count = 0;
        for (int n : numbers) {
            if (n > threshold) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns a new array with the elements in reverse order.
     * Do NOT modify the input array.
     */
    public static int[] reversed(int[] numbers) {
        int[] out = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            out[i] = numbers[numbers.length - 1 - i];
        }
        return out;
    }
}
