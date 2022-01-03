import java.util.Scanner;

public class Customers {

    int CustomerID;
    String CustomerName;
    String ContactName;
    String Address;
    String City;
    int PostalCode;
    String Country;

    public Customers() {

    }

    public Customers(int customerID, String customerName, String contactName, String address, String city, int postalCode, String country) {
        CustomerID = customerID;
        CustomerName = customerName;
        ContactName = contactName;
        Address = address;
        City = city;
        PostalCode = postalCode;
        Country = country;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
