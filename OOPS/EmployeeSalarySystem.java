import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;

    public void setEmployeeDetails(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Salary extends Employee {
    double hra;
    double da;

    public void calculateAndDisplaySalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        double totalSalary = basicSalary + hra + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("Total Salary: $" + totalSalary);
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salary empSalary = new Salary();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        empSalary.setEmployeeDetails(name, basic);

        System.out.println("\n--- Salary Details ---");
        empSalary.calculateAndDisplaySalary();

        scanner.close();
    }
}
