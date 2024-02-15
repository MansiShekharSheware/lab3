package demojava;
import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // consume newline character
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            students[i] = new Student(rollNo, name, marks);
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
