import java.util.Scanner;

abstract class UniversityPerson {
    String name;
    String id;

    public void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void displayRole();
}

interface PortalAccess {
    void login();

    void logout();
}

class Faculty extends UniversityPerson implements PortalAccess {
    String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Faculty member in the " + department + " department.");
    }

    public void login() {
        System.out.println("Faculty ID " + id + " has logged into the University Portal.");
    }

    public void logout() {
        System.out.println("Faculty ID " + id + " has logged out.");
    }
}

class Student extends UniversityPerson implements PortalAccess {
    String major;

    public void setMajor(String major) {
        this.major = major;
    }

    void displayRole() {
        System.out.println(name + " is a Student majoring in " + major + ".");
    }

    public void login() {
        System.out.println("Student ID " + id + " has logged into the Student Portal.");
    }

    public void logout() {
        System.out.println("Student ID " + id + " has logged out.");
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Faculty faculty = new Faculty();
        System.out.println("--- Faculty Registration ---");
        System.out.print("Enter Faculty Name: ");
        String facName = scanner.nextLine();
        System.out.print("Enter Faculty ID: ");
        String facId = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        faculty.setDetails(facName, facId);
        faculty.setDepartment(dept);

        Student student = new Student();
        System.out.println("\n--- Student Registration ---");
        System.out.print("Enter Student Name: ");
        String stuName = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String stuId = scanner.nextLine();
        System.out.print("Enter Major: ");
        String major = scanner.nextLine();

        student.setDetails(stuName, stuId);
        student.setMajor(major);

        System.out.println("\n--- Portal Operations ---");
        faculty.login();
        faculty.displayRole();
        faculty.logout();

        System.out.println();

        student.login();
        student.displayRole();
        student.logout();

        scanner.close();
    }
}
