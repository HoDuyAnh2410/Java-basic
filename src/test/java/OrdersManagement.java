import java.util.ArrayList;
import java.util.Scanner;

public class OrdersManagement {
    ArrayList orderList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewOrder() {
        Orders order = new Orders();
        System.out.print("Order ID: ");
        order.OrderID = input.nextInt();
        System.out.print("Customer ID: ");
        order.CustomerID = input.nextInt();
        System.out.print("Employee ID: ");
        order.EmployeeID = input.nextInt();
        System.out.print("Shipper ID: ");
        order.ShipperID = input.nextInt();
        System.out.print("Order date: ");
        order.OrderDate = input.next();

        orderList.add(order);
    }

    void displayOrderList() {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
    }

    public static void main(String[] args) {
        OrdersManagement orderManagement = new OrdersManagement();
        orderManagement.addNewOrder();
        orderManagement.addNewOrder();
        orderManagement.addNewOrder();
        orderManagement.displayOrderList();
    }
}
