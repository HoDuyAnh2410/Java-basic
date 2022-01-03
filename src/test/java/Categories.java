import java.util.Scanner;

public class Categories {
    int CategoryID;
    String CategoryName;
    String Description;

    public Categories() {
    }


    public Categories(int categoryID, String categoryName, String description) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        Description = description;
    }

    @Override
    public String toString() {
        return getCategoryID() + " " + getCategoryName() + " " + getDescription();
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
