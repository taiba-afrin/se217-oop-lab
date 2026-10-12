
import java.util.Scanner;

class StudentInfo {

    int id;
    String name;
    double marks;

    StudentInfo(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentInfo[] students = new StudentInfo[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            students[i] = new StudentInfo(id, name, marks);
            System.out.println();
        }

        System.out.println("===== ALL STUDENTS =====");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                "ID: " + students[i].id +
                ", Name: " + students[i].name +
                ", Marks: " + students[i].marks
            );
        }

        StudentInfo topper = students[0];

        for (int i = 1; i < 5; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("\n===== TOPPER =====");
        System.out.println("ID: " + topper.id);
        System.out.println("Name: " + topper.name);
        System.out.println("Marks: " + topper.marks);

        double total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + students[i].marks;
        }

        double average = total / 5;

        System.out.println("\nAverage Marks: " + average);

        sc.close();
    }
}
