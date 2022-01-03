import java.util.Scanner;

public class Shippers {
    int ShipperID;
    String ShipperName;
    int Phone;

    public Shippers() {
    }

    public Shippers(int shipperID, String shipperName, int phone) {
        ShipperID = shipperID;
        ShipperName = shipperName;
        Phone = phone;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String shipperName) {
        ShipperName = shipperName;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
