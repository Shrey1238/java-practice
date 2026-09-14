package practice.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CollectionsTest {

    @Test
    void evens() {
        assertEquals(List.of(), Collections.evens(List.of()));
        assertEquals(List.of(2, 4), Collections.evens(List.of(1, 2, 3, 4, 5)));
        assertEquals(List.of(0, -2), Collections.evens(List.of(0, -2, 7)));
    }

    @Test
    void removeDuplicates() {
        assertEquals(List.of(), Collections.removeDuplicates(List.of()));
        assertEquals(List.of(3, 1, 2), Collections.removeDuplicates(List.of(3, 1, 3, 2, 1)));
        assertEquals(List.of(1), Collections.removeDuplicates(List.of(1, 1, 1)));
    }

    @Test
    void wordFrequency() {
        assertEquals(Map.of(), Collections.wordFrequency(""));
        assertEquals(Map.of("hi", 1), Collections.wordFrequency("hi"));
        assertEquals(
                Map.of("the", 2, "cat", 1, "and", 1, "hat", 1),
                Collections.wordFrequency("the cat and the hat"));
        assertEquals(Map.of("the", 2), Collections.wordFrequency("The the"));
    }

    @Test
    void mostCommon() {
        assertEquals(1, Collections.mostCommon(List.of(1)));
        assertEquals(3, Collections.mostCommon(List.of(1, 3, 2, 3, 1, 3)));
        assertThrows(IllegalArgumentException.class, () -> Collections.mostCommon(List.of()));
    }

    @Test
    void groupByLength() {
        assertEquals(Map.of(), Collections.groupByLength(List.of()));
        assertEquals(
                Map.of(1, List.of("a"), 2, List.of("bb", "cc"), 3, List.of("ddd")),
                Collections.groupByLength(List.of("a", "bb", "cc", "ddd")));
    }

    @Test
    void hasPairWithSum() {
        assertTrue(Collections.hasPairWithSum(List.of(2, 7, 11, 15), 9));
        assertTrue(Collections.hasPairWithSum(List.of(3, 3), 6));
        assertFalse(Collections.hasPairWithSum(List.of(3), 6), "must use two different elements");
        assertFalse(Collections.hasPairWithSum(List.of(1, 2, 3), 6));
        assertFalse(Collections.hasPairWithSum(List.of(), 0));
    }

    @Test
    void mergeSorted() {
        assertEquals(List.of(), Collections.mergeSorted(List.of(), List.of()));
        assertEquals(List.of(1, 2), Collections.mergeSorted(List.of(1, 2), List.of()));
        assertEquals(List.of(1, 2), Collections.mergeSorted(List.of(), List.of(1, 2)));
        assertEquals(
                List.of(1, 2, 3, 4, 9, 10),
                Collections.mergeSorted(List.of(1, 4, 9), List.of(2, 3, 10)));
        assertEquals(List.of(1, 1, 2, 2), Collections.mergeSorted(List.of(1, 2), List.of(1, 2)));
    }

    @Test
    void intersection() {
        assertEquals(Set.of(), Collections.intersection(List.of(1, 2), List.of(3)));
        assertEquals(Set.of(2, 3), Collections.intersection(List.of(1, 2, 2, 3), List.of(2, 3, 4)));
    }
}
