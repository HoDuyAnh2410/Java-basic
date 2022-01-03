import java.util.ArrayList;
import java.util.Scanner;

public class ProductsManagement {
    ArrayList productList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewProduct() {
        Products products = new Products();
        System.out.print("Product ID: ");
        products.ProductID = input.nextInt();
        System.out.print("Product name: ");
        products.ProductName = input.next();
        System.out.print("Supplier ID: ");
        products.SupplierID = input.nextInt();
        System.out.print("Category ID: ");
        products.CategoryID = input.nextInt();
        System.out.print("Unit: ");
        products.Unit = input.next();
        System.out.print("Price: ");
        products.Price = input.nextInt();

        productList.add(products);
    }

    void displayProductList() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    public static void main(String[] args) {
        ProductsManagement productsManagement = new ProductsManagement();
        productsManagement.addNewProduct();
        productsManagement.addNewProduct();
        productsManagement.addNewProduct();
        productsManagement.displayProductList();
    }
}
