import java.util.Scanner;

public class OrderDetails {
    int OrderDetailID;
    int OrderID;
    int ProductID;
    int Quantity;

    public OrderDetails() {
    }

    public OrderDetails(int orderDetailID, int orderID, int productID, int quantity) {
        OrderDetailID = orderDetailID;
        OrderID = orderID;
        ProductID = productID;
        Quantity = quantity;
    }

    public int getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        OrderDetailID = orderDetailID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
