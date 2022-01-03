import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        System.out.println("\n------------- CREATE NEW INFORMATION -------------\n");
        System.out.println("1. Create a new category");
        System.out.println("2. Create a new customer");
        System.out.println("3. Create a new employee");
        System.out.println("4. Create a new order details");
        System.out.println("5. Create a new order");
        System.out.println("6. Create a new product");
        System.out.println("7. Create a new shipper");
        System.out.println("8. Create a new supplier.");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("\nCreate a new category");
                CategoryManagement categoryManagement = new CategoryManagement();
                categoryManagement.addNewCategory();
                break;
            case 2:
                System.out.println("\nCreate a new customer");
                CustomersManagement customersManagement = new CustomersManagement();
                customersManagement.addNewCustomer();
                break;
            case 3:
                System.out.println("\nCreate a new employee");
                EmployeesManagement employeesManagement = new EmployeesManagement();
                employeesManagement.addNewEmployee();
                break;
            case 4:
                System.out.println("\nCreate a new order details");
                OrderDetailsManagement orderDetailsManagement = new OrderDetailsManagement();
                orderDetailsManagement.addNewOrderDetails();
                break;
            case 5:
                System.out.println("\nCreate a new order");
                OrdersManagement ordersManagement = new OrdersManagement();
                ordersManagement.addNewOrder();
                break;
            case 6:
                System.out.println("\nCreate a new product");
                ProductsManagement productsManagement = new ProductsManagement();
                productsManagement.addNewProduct();
                break;
            case 7:
                System.out.println("\nCreate a new shipper");
                ShippersManagement shippersManagement = new ShippersManagement();
                shippersManagement.addNewShipper();
                break;
            case 8:
                System.out.println("\nCreate a new supplier");
                SuppliersManagement suppliersManagement = new SuppliersManagement();
                suppliersManagement.addNewSupplier();
                break;
            default:
                System.out.println("\nPlease enter from 1 to 8.");
        }

    }
}
