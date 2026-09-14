package practice.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Week 2: ArrayList, HashMap, HashSet.
 *
 * These three classes are ~80% of what you'll use in class and interviews.
 * Before starting, read the docs for:
 *   List:  add, get, set, remove, size, contains, isEmpty
 *   Map:   put, get, getOrDefault, containsKey, keySet, entrySet, values
 *   Set:   add (returns false if already present!), contains
 *
 * Interviews: HashMap lookups are O(1). Whenever you'd write a nested loop
 * that "looks for" something, ask yourself if a HashMap or HashSet removes the inner loop.
 */
public class Collections {

    /** Returns a new list with only the even numbers, in the original order. */
    public static List<Integer> evens(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns a new list with duplicates removed, keeping the FIRST occurrence of each. [3,1,3,2,1] -> [3,1,2]. */
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Counts how many times each word appears. Words are separated by single spaces; treat
     * "The" and "the" as the same word (lower-case everything).
     * "the cat and the hat" -> {the=2, cat=1, and=1, hat=1}
     */
    public static Map<String, Integer> wordFrequency(String text) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns the element that appears most often. If there's a tie, any of the tied elements is fine.
     *
     * @throws IllegalArgumentException if the list is empty
     */
    public static int mostCommon(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Groups words by their length.
     * ["a", "bb", "cc", "ddd"] -> {1=[a], 2=[bb, cc], 3=[ddd]}
     * Hint: map.computeIfAbsent(key, k -> new ArrayList<>()) is a handy one-liner, but
     * try it with containsKey first so you understand what it's doing.
     */
    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns true if any two DIFFERENT elements add up to target.
     * [2, 7, 11, 15], 9 -> true (2 + 7).   [1, 2, 3], 6 -> false.
     * First write it with two nested loops. Then rewrite it with a HashSet in one pass.
     * This is LeetCode #1 ("Two Sum") — the most famous interview question there is.
     */
    public static boolean hasPairWithSum(List<Integer> numbers, int target) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Merges two already-sorted lists into one sorted list.
     * [1, 4, 9] + [2, 3, 10] -> [1, 2, 3, 4, 9, 10].
     * Don't just concatenate and sort — walk both lists with two indexes ("two pointers").
     */
    public static List<Integer> mergeSorted(List<Integer> a, List<Integer> b) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns the elements that appear in BOTH lists, with no duplicates, in any order.
     * [1, 2, 2, 3] & [2, 3, 4] -> [2, 3]
     */
    public static Set<Integer> intersection(List<Integer> a, List<Integer> b) {
        throw new UnsupportedOperationException("TODO");
    }
}
