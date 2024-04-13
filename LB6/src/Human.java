import java.util.Date;
import java.util.List;

public abstract class Human {
    protected Integer id;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String address;
    protected String phoneNumber;

    public abstract void printInfo();

    public Human() {
    }

    public Human(Integer id, String lastName, String firstName, String middleName, String address, String phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Human(Human original) {
        this.id = original.id;
        this.lastName = original.lastName;
        this.firstName = original.firstName;
        this.middleName = original.middleName;
        this.address = original.address;
        this.phoneNumber = original.phoneNumber;
    }

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
}
