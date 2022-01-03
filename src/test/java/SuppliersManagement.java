import java.util.ArrayList;
import java.util.Scanner;

public class SuppliersManagement {
    ArrayList supplierList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewSupplier() {
        Suppliers suppliers = new Suppliers();
        System.out.print("Supplier ID: ");
        suppliers.SupplierID = input.nextInt();
        System.out.print("Supplier Name: ");
        suppliers.SupplierName = input.next();
        System.out.print("Contact name: ");
        suppliers.ContactName = input.next();
        System.out.print("Address: ");
        suppliers.Address = input.next();
        System.out.print("City: ");
        suppliers.City = input.next();
        System.out.print("Postal code: ");
        suppliers.PostalCode = input.nextInt();
        System.out.print("Country: ");
        suppliers.Country = input.next();
        System.out.print("Phone: ");
        suppliers.Phone = input.nextInt();

        supplierList.add(suppliers);
    }

    void displayShipperList() {
        for (int i = 0; i < supplierList.size(); i++) {
            System.out.println(supplierList.get(i));
        }
    }

    public static void main(String[] args) {
        SuppliersManagement suppliersManagement = new SuppliersManagement();
        suppliersManagement.addNewSupplier();
        suppliersManagement.addNewSupplier();
        suppliersManagement.addNewSupplier();
        suppliersManagement.displayShipperList();
    }
}
