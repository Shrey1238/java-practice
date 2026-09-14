package practice.week1;

/**
 * Week 1, Part B: Strings.
 *
 * Useful methods to look up in the docs before starting:
 *   length(), charAt(i), toLowerCase(), toUpperCase(), substring(a, b),
 *   indexOf(c), split(" "), trim(), equals(), StringBuilder.append()/reverse()
 *
 * Remember: Strings are immutable. Every "change" creates a new String.
 * Compare Strings with .equals(), never with ==.
 */
public class Strings {

    /** Returns the number of vowels (a, e, i, o, u — either case) in s. */
    public static int countVowels(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns s reversed. "hello" -> "olleh". Write your own loop first, then look at StringBuilder.reverse(). */
    public static String reverse(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns true if s reads the same forwards and backwards, ignoring case and
     * ignoring anything that is not a letter or digit.
     * "Racecar" -> true, "A man, a plan, a canal: Panama" -> true, "hello" -> false.
     * Hint: Character.isLetterOrDigit(c)
     */
    public static boolean isPalindrome(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns the number of words, where words are separated by one or more spaces. "" and "   " have 0 words. */
    public static int countWords(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Capitalizes the first letter of every word. "hello big world" -> "Hello Big World". Single spaces only. */
    public static String capitalizeWords(String s) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns how many times {@code c} appears in s. */
    public static int countChar(String s, char c) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns true if a and b are anagrams (same letters, different order), ignoring case.
     * "listen" / "silent" -> true.  "rat" / "car" -> false.
     * Hint: counting letters in an int[26] is a classic interview trick.
     */
    public static boolean isAnagram(String a, String b) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Run-length encoding: "aaabccdddd" -> "a3b1c2d4". "" -> "".
     */
    public static String compress(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
