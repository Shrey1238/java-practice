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
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    /** Returns s reversed. "hello" -> "olleh". Write your own loop first, then look at StringBuilder.reverse(). */
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Returns true if s reads the same forwards and backwards, ignoring case and
     * ignoring anything that is not a letter or digit.
     * "Racecar" -> true, "A man, a plan, a canal: Panama" -> true, "hello" -> false.
     * Hint: Character.isLetterOrDigit(c)
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);
            if (!Character.isLetterOrDigit(a)) {
                left++;
            } else if (!Character.isLetterOrDigit(b)) {
                right--;
            } else {
                if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    /** Returns the number of words, where words are separated by one or more spaces. "" and "   " have 0 words. */
    public static int countWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    /** Capitalizes the first letter of every word. "hello big world" -> "Hello Big World". Single spaces only. */
    public static String capitalizeWords(String s) {
        if (s.isEmpty()) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1));
            }
            if (i < words.length - 1) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /** Returns how many times {@code c} appears in s. */
    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns true if a and b are anagrams (same letters, different order), ignoring case.
     * "listen" / "silent" -> true.  "rat" / "car" -> false.
     * Hint: counting letters in an int[26] is a classic interview trick.
     */
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < a.length(); i++) {
            counts[Character.toLowerCase(a.charAt(i)) - 'a']++;
            counts[Character.toLowerCase(b.charAt(i)) - 'a']--;
        }
        for (int c : counts) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Run-length encoding: "aaabccdddd" -> "a3b1c2d4". "" -> "".
     */
    public static String compress(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char current = s.charAt(0);
        int run = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                run++;
            } else {
                sb.append(current).append(run);
                current = s.charAt(i);
                run = 1;
            }
        }
        sb.append(current).append(run);
        return sb.toString();
    }
}
