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
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student other = (Student) o;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student other) {
        int byGpa = Double.compare(other.gpa, this.gpa);
        if (byGpa != 0) {
            return byGpa;
        }
        return this.name.compareTo(other.name);
    }

    /** "Student[id=1, name=Alice, gpa=3.9]" */
    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
    }
}
