import java.util.ArrayList;
import java.util.Scanner;

public class ShippersManagement {
    ArrayList shipperList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewShipper() {
        Shippers shippers = new Shippers();
        System.out.print("Shipper ID: ");
        shippers.ShipperID = input.nextInt();
        System.out.print("Shipper name: ");
        shippers.ShipperName = input.next();
        System.out.print("Phone: ");
        shippers.Phone = input.nextInt();

        shipperList.add(shippers);
    }

    void displayShipperList() {
        for (int i = 0; i < shipperList.size(); i++) {
            System.out.println(shipperList.get(i));
        }
    }

    public static void main(String[] args) {
        ShippersManagement shippersManagement = new ShippersManagement();
        shippersManagement.addNewShipper();
        shippersManagement.addNewShipper();
        shippersManagement.addNewShipper();
        shippersManagement.displayShipperList();
    }
}
