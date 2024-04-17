import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LibraryMember extends Human implements Comparable<LibraryMember> {    Integer id;
    String lastName;
    String firstName;
    String middleName;
    String phoneNumber;
    String address;
    List<String> borrowedBooks;
    Date lastVisitDate;
    Boolean overdueIncidents;
    public static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public LibraryMember() {
        super();
    }

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String address, String phoneNumber) {
        super(id, lastName, firstName, middleName, address, phoneNumber);
    }

    public LibraryMember(LibraryMember original) {
        super(original);
    }

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String address, Date lastVisitDate, Boolean overdueIncidents, List<String> borrowedBooks) {
        counter++;
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.borrowedBooks = borrowedBooks;
        this.lastVisitDate = lastVisitDate;
        this.overdueIncidents = overdueIncidents;
    }

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String phoneNumber) {
        counter++;
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.address = "вул. Мазепи, 1";
        this.borrowedBooks = Arrays.asList("Земля", "Тигролови");
        this.lastVisitDate = new Date();
        this.overdueIncidents = true;
    }

    public LibraryMember(String address, Date lastVisitDate, Boolean overdueIncidents, List<String> borrowedBooks) {
        counter ++;
        this.id = 1;
        this.lastName = "LastName1";
        this.firstName = "FirstName1";
        this.middleName = "MiddleName1";
        this.phoneNumber = "0124232323";
        this.address = address;
        this.borrowedBooks = borrowedBooks;
        this.lastVisitDate = lastVisitDate;
        this.overdueIncidents = overdueIncidents;
    }


    // Гетери та сетери
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Boolean isOverdueIncidents() {
        return overdueIncidents;
    }

    public void setOverdueIncidents(Boolean overdueIncidents) {
        this.overdueIncidents = overdueIncidents;
    }

    @Override
    public void printInfo() {
        System.out.println("Library Member Info:");
        System.out.println("ID: " + id);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }

    @Override
    public int compareTo(LibraryMember other) {
        int compareByDate = this.getLastVisitDate().compareTo(other.getLastVisitDate());
        if (compareByDate != 0) {
            return compareByDate;
        }
        return this.getLastName().compareTo(other.getLastName());
    }
}