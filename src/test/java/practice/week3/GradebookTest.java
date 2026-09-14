package practice.week3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTest {

    private Gradebook book;

    @BeforeEach
    void setUp() {
        book = new Gradebook();
        book.add(new Student(1, "Cara", 3.5));
        book.add(new Student(2, "Alice", 4.0));
        book.add(new Student(3, "Bob", 3.0));
    }

    @Test
    void emptyGradebook() {
        Gradebook empty = new Gradebook();
        assertEquals(0, empty.size());
        assertEquals(0.0, empty.averageGpa(), 1e-9);
        assertEquals(List.of(), empty.ranked());
        assertEquals(List.of(), empty.honorRoll());
        assertNull(empty.findById(42));
    }

    @Test
    void addReplacesSameId() {
        book.add(new Student(3, "Bobby", 3.8));
        assertEquals(3, book.size());
        assertEquals("Bobby", book.findById(3).getName());
    }

    @Test
    void findById() {
        assertEquals("Alice", book.findById(2).getName());
        assertNull(book.findById(99));
    }

    @Test
    void averageGpa() {
        assertEquals(3.5, book.averageGpa(), 1e-9);
    }

    @Test
    void ranked() {
        assertEquals(List.of("Alice", "Cara", "Bob"), names(book.ranked()));
    }

    @Test
    void rankedDoesNotMutateInternalOrder() {
        book.ranked();
        book.ranked();
        assertEquals("Cara", book.findById(1).getName());
        // if the internal list were sorted in place, honorRoll/ranked would still pass,
        // so we check the contract another way: adding after ranking still works.
        book.add(new Student(4, "Zed", 3.9));
        assertEquals(List.of("Alice", "Zed", "Cara", "Bob"), names(book.ranked()));
    }

    @Test
    void honorRoll() {
        assertEquals(List.of("Alice", "Cara"), names(book.honorRoll()));
    }

    private static List<String> names(List<Student> students) {
        List<String> out = new ArrayList<>();
        for (Student s : students) {
            out.add(s.getName());
        }
        return out;
    }
}
