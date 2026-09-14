package practice.week1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BasicsTest {

    @Test
    void isEven() {
        assertTrue(Basics.isEven(0));
        assertTrue(Basics.isEven(4));
        assertTrue(Basics.isEven(-4));
        assertFalse(Basics.isEven(7));
        assertFalse(Basics.isEven(-7));
    }

    @Test
    void sum() {
        assertEquals(0, Basics.sum(new int[] {}));
        assertEquals(6, Basics.sum(new int[] {1, 2, 3}));
        assertEquals(-1, Basics.sum(new int[] {5, -6}));
    }

    @Test
    void max() {
        assertEquals(9, Basics.max(new int[] {3, 9, 2}));
        assertEquals(-2, Basics.max(new int[] {-5, -2, -8}));
        assertEquals(1, Basics.max(new int[] {1}));
        assertThrows(IllegalArgumentException.class, () -> Basics.max(new int[] {}));
    }

    @Test
    void average() {
        assertEquals(0.0, Basics.average(new int[] {}));
        assertEquals(2.5, Basics.average(new int[] {2, 3}), 1e-9);
        assertEquals(2.0, Basics.average(new int[] {1, 2, 3}), 1e-9);
    }

    @Test
    void factorial() {
        assertEquals(1, Basics.factorial(0));
        assertEquals(1, Basics.factorial(1));
        assertEquals(120, Basics.factorial(5));
        assertEquals(2432902008176640000L, Basics.factorial(20));
        assertThrows(IllegalArgumentException.class, () -> Basics.factorial(-1));
    }

    @Test
    void isPrime() {
        assertFalse(Basics.isPrime(-7));
        assertFalse(Basics.isPrime(0));
        assertFalse(Basics.isPrime(1));
        assertTrue(Basics.isPrime(2));
        assertTrue(Basics.isPrime(3));
        assertFalse(Basics.isPrime(4));
        assertTrue(Basics.isPrime(97));
        assertFalse(Basics.isPrime(100));
        assertTrue(Basics.isPrime(7919));
    }

    @Test
    void fizzBuzz() {
        assertEquals("1", Basics.fizzBuzz(1));
        assertEquals("Fizz", Basics.fizzBuzz(3));
        assertEquals("Buzz", Basics.fizzBuzz(5));
        assertEquals("Fizz", Basics.fizzBuzz(9));
        assertEquals("FizzBuzz", Basics.fizzBuzz(15));
        assertEquals("FizzBuzz", Basics.fizzBuzz(30));
        assertEquals("7", Basics.fizzBuzz(7));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, Basics.celsiusToFahrenheit(0), 1e-9);
        assertEquals(212.0, Basics.celsiusToFahrenheit(100), 1e-9);
        assertEquals(98.6, Basics.celsiusToFahrenheit(37), 1e-9);
        assertEquals(-40.0, Basics.celsiusToFahrenheit(-40), 1e-9);
    }

    @Test
    void countGreaterThan() {
        assertEquals(0, Basics.countGreaterThan(new int[] {}, 5));
        assertEquals(2, Basics.countGreaterThan(new int[] {1, 6, 10, 5}, 5));
        assertEquals(0, Basics.countGreaterThan(new int[] {1, 2, 3}, 3));
    }

    @Test
    void reversed() {
        assertArrayEquals(new int[] {}, Basics.reversed(new int[] {}));
        assertArrayEquals(new int[] {3, 2, 1}, Basics.reversed(new int[] {1, 2, 3}));

        int[] original = {1, 2, 3, 4};
        Basics.reversed(original);
        assertArrayEquals(new int[] {1, 2, 3, 4}, original, "input array must not be modified");
    }
}
