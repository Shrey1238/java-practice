package practice.week1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringsTest {

    @Test
    void countVowels() {
        assertEquals(0, Strings.countVowels(""));
        assertEquals(0, Strings.countVowels("xyz"));
        assertEquals(2, Strings.countVowels("hello"));
        assertEquals(5, Strings.countVowels("AEIOU"));
        assertEquals(3, Strings.countVowels("Programming"));
    }

    @Test
    void reverse() {
        assertEquals("", Strings.reverse(""));
        assertEquals("a", Strings.reverse("a"));
        assertEquals("olleh", Strings.reverse("hello"));
        assertEquals("dlrow olleh", Strings.reverse("hello world"));
    }

    @Test
    void isPalindrome() {
        assertTrue(Strings.isPalindrome(""));
        assertTrue(Strings.isPalindrome("a"));
        assertTrue(Strings.isPalindrome("racecar"));
        assertTrue(Strings.isPalindrome("Racecar"));
        assertTrue(Strings.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(Strings.isPalindrome("hello"));
        assertFalse(Strings.isPalindrome("ab"));
    }

    @Test
    void countWords() {
        assertEquals(0, Strings.countWords(""));
        assertEquals(0, Strings.countWords("    "));
        assertEquals(1, Strings.countWords("hello"));
        assertEquals(2, Strings.countWords("hello world"));
        assertEquals(3, Strings.countWords("  a   b  c  "));
    }

    @Test
    void capitalizeWords() {
        assertEquals("", Strings.capitalizeWords(""));
        assertEquals("Hello", Strings.capitalizeWords("hello"));
        assertEquals("Hello Big World", Strings.capitalizeWords("hello big world"));
        assertEquals("Already Done", Strings.capitalizeWords("Already Done"));
    }

    @Test
    void countChar() {
        assertEquals(0, Strings.countChar("", 'a'));
        assertEquals(2, Strings.countChar("banana", 'n'));
        assertEquals(3, Strings.countChar("banana", 'a'));
        assertEquals(0, Strings.countChar("banana", 'z'));
    }

    @Test
    void isAnagram() {
        assertTrue(Strings.isAnagram("listen", "silent"));
        assertTrue(Strings.isAnagram("Listen", "Silent"));
        assertTrue(Strings.isAnagram("", ""));
        assertFalse(Strings.isAnagram("rat", "car"));
        assertFalse(Strings.isAnagram("aab", "abb"));
        assertFalse(Strings.isAnagram("abc", "abcd"));
    }

    @Test
    void compress() {
        assertEquals("", Strings.compress(""));
        assertEquals("a1", Strings.compress("a"));
        assertEquals("a3b1c2d4", Strings.compress("aaabccdddd"));
        assertEquals("a1b1a1", Strings.compress("aba"));
    }
}
