
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        setMarks(marks);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }

    public void displayInfo() {
        System.out.println("\n----- Student Information -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student marks (0-100): ");
        double marks = input.nextDouble();
        
        Student student = new Student(id, name, marks);

        student.displayInfo();
    
        input.nextLine();

        System.out.print("\nEnter updated student ID: ");
        int newId = input.nextInt();
        input.nextLine();
        student.setId(newId);

        System.out.print("Enter updated student name: ");
        String newName = input.nextLine();
        student.setName(newName);

        System.out.print("Enter updated marks (0-100): ");
        double newMarks = input.nextDouble();
        student.setMarks(newMarks);
        student.displayInfo();

        input.close();
    
    }
}


