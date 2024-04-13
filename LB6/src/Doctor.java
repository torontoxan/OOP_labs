import java.util.Arrays;
import java.util.Date;

public class Doctor extends Human {
    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phoneNumber;
    private String specialization;

    public Doctor() {
        super();
    }

    public Doctor(Integer id, String lastName, String firstName, String middleName, String address, String phoneNumber) {
        super(id, lastName, firstName, middleName, address, phoneNumber);
    }

    public Doctor(Doctor original) {
        super(original);
    }

    // Параметризований конструктор
    public Doctor(Integer id, String lastName, String firstName, String middleName, String address, String phoneNumber, String specialization) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.specialization = specialization;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Метод toString
    @Override
    public void printInfo() {
        System.out.println("Doctor Info:");
        System.out.println("ID: " + id);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
