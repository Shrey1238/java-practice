package practice.week3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void equalityIsById() {
        Student a = new Student(1, "Alice", 3.9);
        Student sameId = new Student(1, "Alicia", 2.0);
        Student other = new Student(2, "Alice", 3.9);

        assertEquals(a, sameId);
        assertEquals(a.hashCode(), sameId.hashCode(), "equal objects must have equal hashCodes");
        assertNotEquals(a, other);
        assertNotEquals(a, null);
        assertNotEquals(a, "not a student");
    }

    @Test
    void worksInHashSet() {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "Alice", 3.9));
        set.add(new Student(1, "Alice again", 1.0));
        set.add(new Student(2, "Bob", 3.0));
        assertEquals(2, set.size());
        assertTrue(set.contains(new Student(2, "anyone", 0.0)));
    }

    @Test
    void sortsByGpaDescendingThenName() {
        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Cara", 3.5),
                new Student(2, "Alice", 4.0),
                new Student(3, "Bob", 3.5),
                new Student(4, "Dan", 2.0)));
        Collections.sort(students);
        assertEquals(List.of("Alice", "Bob", "Cara", "Dan"), names(students));
    }

    @Test
    void toStringFormat() {
        assertEquals("Student[id=1, name=Alice, gpa=3.9]", new Student(1, "Alice", 3.9).toString());
    }

    private static List<String> names(List<Student> students) {
        List<String> out = new ArrayList<>();
        for (Student s : students) {
            out.add(s.getName());
        }
        return out;
    }
}
