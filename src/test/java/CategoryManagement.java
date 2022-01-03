import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CategoryManagement {

    ArrayList categoryList = new ArrayList();
    Scanner input = new Scanner(System.in);

    void addNewCategory() {
        Categories category = new Categories();
        System.out.print("Category ID: ");
        category.CategoryID = input.nextInt();
        System.out.print("Category Name: ");
        category.CategoryName = input.next();
        System.out.print("Description: ");
        category.Description = input.next();

        categoryList.add(category);
    }

    void displayCategoryList() {
        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println(categoryList.get(i));
        }
    }

    public static void main(String[] args) {
        CategoryManagement categoryManagement = new CategoryManagement();
        categoryManagement.addNewCategory();
        categoryManagement.addNewCategory();
        categoryManagement.addNewCategory();
        categoryManagement.displayCategoryList();
    }
}
