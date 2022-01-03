import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesManagement {
    ArrayList employeeList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewEmployee() {
        Employees employees = new Employees();
        System.out.print("Employee ID: ");
        employees.EmployeeID = input.nextInt();
        System.out.print("Last name: ");
        employees.LastName = input.next();
        System.out.print("First name: ");
        employees.FirstName = input.next();
        System.out.print("Birth date: ");
        employees.BirthDate = input.next();
        System.out.print("Photo: ");
        employees.Photo = input.next();
        System.out.print("Notes: ");
        employees.Notes = input.next();

        employeeList.add(employees);
    }

    void displayEmployeeList() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }

    public static void main(String[] args) {
        EmployeesManagement employeeManagement = new EmployeesManagement();
        employeeManagement.addNewEmployee();
        employeeManagement.addNewEmployee();
        employeeManagement.addNewEmployee();
        employeeManagement.displayEmployeeList();
    }
}
