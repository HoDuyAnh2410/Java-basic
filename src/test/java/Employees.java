import java.util.Scanner;

public class Employees {
    int EmployeeID;
    String LastName;
    String FirstName;
    String BirthDate;
    String Photo;
    String Notes;

    public Employees() {
    }

    public Employees(int employeeID, String lastName, String firstName, String birthDate, String photo, String notes) {
        EmployeeID = employeeID;
        LastName = lastName;
        FirstName = firstName;
        BirthDate = birthDate;
        Photo = photo;
        Notes = notes;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
