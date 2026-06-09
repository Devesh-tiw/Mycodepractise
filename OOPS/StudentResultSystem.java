import java.util.*;

class Student {
    String name;
    int rollNumber;

    public void setStudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Result extends Student {
    double marks;

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        result.setStudentDetails(name, roll);
        result.setMarks(marks);

        System.out.println("\n--- Complete Result ---");
        result.displayResult();

        scanner.close();
    }
}
