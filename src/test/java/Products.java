import java.util.Scanner;

public class Products {
    int ProductID;
    String ProductName;
    int SupplierID;
    int CategoryID;
    String Unit;
    double Price;

    public Products() {
    }

    public Products(int productID, String productName, int supplierID, int categoryID, String unit, double price) {
        ProductID = productID;
        ProductName = productName;
        SupplierID = supplierID;
        CategoryID = categoryID;
        Unit = unit;
        Price = price;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
