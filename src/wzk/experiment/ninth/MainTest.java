package wzk.experiment.ninth;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        student = null;
        try {
            student.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
