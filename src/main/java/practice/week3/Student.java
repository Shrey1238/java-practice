package practice.week3;

import java.util.Objects;

/**
 * Week 3, Part B: equals(), hashCode(), compareTo() — the three methods every exam asks about.
 *
 * Two students are "equal" if they have the same id. Name and gpa don't matter for equality.
 *
 * Contract you must respect (read this twice):
 *  - If a.equals(b) then a.hashCode() == b.hashCode(). Otherwise HashMap/HashSet break.
 *  - Students sort by gpa DESCENDING (highest first). Ties broken by name ascending (A–Z).
 *
 * Hint: java.util.Objects.equals / Objects.hash make this short.
 * Hint: Double.compare(a, b) for comparing doubles — never use == on doubles.
 */
public class Student implements Comparable<Student> {

    private final int id;
    private final String name;
    private final double gpa;

    public Student(int id, String name, double gpa) {
        throw new UnsupportedOperationException("TODO");
    }

    public int getId() {
        throw new UnsupportedOperationException("TODO");
    }

    public String getName() {
        throw new UnsupportedOperationException("TODO");
    }

    public double getGpa() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int compareTo(Student other) {
        throw new UnsupportedOperationException("TODO");
    }

    /** "Student[id=1, name=Alice, gpa=3.9]" */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO");
    }
}
