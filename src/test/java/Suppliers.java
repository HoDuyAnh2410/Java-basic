import java.util.Scanner;

public class Suppliers {
    int SupplierID;
    String SupplierName;
    String ContactName;
    String Address;
    String City;
    int PostalCode;
    String Country;
    int Phone;

    public Suppliers() {
    }

    public Suppliers(int supplierID, String supplierName, String contactName, String address, String city, int postalCode, String country, int phone) {
        SupplierID = supplierID;
        SupplierName = supplierName;
        ContactName = contactName;
        Address = address;
        City = city;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
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

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
