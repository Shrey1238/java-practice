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
        int existing = students.indexOf(student);
        if (existing >= 0) {
            students.set(existing, student);
        } else {
            students.add(student);
        }
    }

    public int size() {
        return students.size();
    }

    /** Returns the student with this id, or null if none. */
    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    /** Average gpa of all students. Empty gradebook -> 0.0. */
    public double averageGpa() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }

    /** Returns all students with gpa >= 3.5, in ranked order (see ranked()). */
    public List<Student> honorRoll() {
        List<Student> out = new ArrayList<>();
        for (Student s : ranked()) {
            if (s.getGpa() >= 3.5) {
                out.add(s);
            }
        }
        return out;
    }

    /**
     * Returns a NEW list of the students sorted using Student.compareTo (highest gpa first).
     * Must not change the order of the internal list. Hint: Collections.sort(copy)
     */
    public List<Student> ranked() {
        List<Student> copy = new ArrayList<>(students);
        Collections.sort(copy);
        return copy;
    }
}
