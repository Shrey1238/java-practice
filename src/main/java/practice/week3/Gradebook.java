package practice.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Week 3, Part C: a class that owns a collection of other objects.
 *
 * This combines everything so far: a private ArrayList field, loops, and using the
 * equals()/compareTo() you wrote in Student.
 */
public class Gradebook {

    private final List<Student> students = new ArrayList<>();

    /**
     * Adds the student. If a student with the same id already exists, replaces it.
     * (Remember: Student.equals compares by id, so list.indexOf(student) finds the match.)
     */
    public void add(Student student) {
        throw new UnsupportedOperationException("TODO");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns the student with this id, or null if none. */
    public Student findById(int id) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Average gpa of all students. Empty gradebook -> 0.0. */
    public double averageGpa() {
        throw new UnsupportedOperationException("TODO");
    }

    /** Returns all students with gpa >= 3.5, in ranked order (see ranked()). */
    public List<Student> honorRoll() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Returns a NEW list of the students sorted using Student.compareTo (highest gpa first).
     * Must not change the order of the internal list. Hint: Collections.sort(copy)
     */
    public List<Student> ranked() {
        throw new UnsupportedOperationException("TODO");
    }
}
