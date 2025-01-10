package wzk.experiment.twelveth;

/**
 * @author PlagueWZK
 * description: StudentTest
 * date: 2025/1/2 20:47
 */

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        Student s3 = new Student("Alice", 20); // 与 s1 相等
        Student s4 = new Student("Charlie", 25);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        System.out.println("HashSet 集合中的元素：");
        for (Student student : hs) {
            System.out.println(student);
        }
    }
}
