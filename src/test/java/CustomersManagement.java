import java.util.ArrayList;
import java.util.Scanner;

public class CustomersManagement {
    ArrayList customerList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewCustomer() {
        Customers customers = new Customers();
        System.out.print("Customer ID: ");
        customers.CustomerID = input.nextInt();
        System.out.print("Customer Name: ");
        customers.CustomerName = input.next();
        System.out.print("Contact name: ");
        customers.ContactName = input.next();
        System.out.print("Address: ");
        customers.Address = input.next();
        System.out.print("City: ");
        customers.City = input.next();
        System.out.print("Postal code: ");
        customers.PostalCode = input.nextInt();
        System.out.print("Country: ");
        customers.Country = input.next();

        customerList.add(customers);
    }

    void displayCustomerList() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    }

    public static void main(String[] args) {
        CustomersManagement customerManagement = new CustomersManagement();
        customerManagement.addNewCustomer();
        customerManagement.addNewCustomer();
        customerManagement.addNewCustomer();
        customerManagement.displayCustomerList();
    }

}
