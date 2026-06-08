import java.util.Scanner;

class Person {
    String name;
    int age;

    public void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;

    public void setEmployeeDetails(int empId) {
        this.empId = empId;
    }
}

class Manager extends Employee {
    double managerSalary;

    public void setManagerDetails(double managerSalary) {
        this.managerSalary = managerSalary;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + managerSalary);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager mgr = new Manager();

        System.out.print("Enter Manager Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        mgr.setPersonDetails(name, age);
        mgr.setEmployeeDetails(empId);
        mgr.setManagerDetails(salary);

        System.out.println("\n--- Manager Profile ---");
        mgr.displayManagerInfo();

        scanner.close();
    }
}
