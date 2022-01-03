import java.util.Scanner;

public class Orders {
    int OrderID;
    int CustomerID;
    int EmployeeID;
    String OrderDate;
    int ShipperID;

    public Orders() {
    }

    public Orders(int orderID, int customerID, int employeeID, String orderDate, int shipperID) {
        OrderID = orderID;
        CustomerID = customerID;
        EmployeeID = employeeID;
        OrderDate = orderDate;
        ShipperID = shipperID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }
}
