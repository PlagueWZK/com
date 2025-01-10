package wzk.experiment.twelveth;

/**
 * @author PlagueWZK
 * description: Student
 * date: 2025/1/2 20:46
 */

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + Objects.hash(age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return this.hashCode() == other.hashCode();
    }
}
