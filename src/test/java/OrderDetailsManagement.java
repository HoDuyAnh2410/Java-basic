import java.util.ArrayList;
import java.util.Scanner;

public class OrderDetailsManagement {
    ArrayList orderDetailsList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewOrderDetails() {
        OrderDetails orderDetails = new OrderDetails();
        System.out.print("OrderDetail ID: ");
        orderDetails.OrderDetailID = input.nextInt();
        System.out.print("Order ID: ");
        orderDetails.OrderID = input.nextInt();
        System.out.print("Product ID: ");
        orderDetails.ProductID = input.nextInt();
        System.out.print("Quantity: ");
        orderDetails.Quantity = input.nextInt();

        orderDetailsList.add(orderDetails);
    }

    void displayOrderDetailsList() {
        for (int i = 0; i < orderDetailsList.size(); i++) {
            System.out.println(orderDetailsList.get(i));
        }
    }

    public static void main(String[] args) {
        OrderDetailsManagement orderDetailsManagement = new OrderDetailsManagement();
        orderDetailsManagement.addNewOrderDetails();
        orderDetailsManagement.addNewOrderDetails();
        orderDetailsManagement.addNewOrderDetails();
        orderDetailsManagement.displayOrderDetailsList();
    }
}
