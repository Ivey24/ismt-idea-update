package entity;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;

    public Customer() {
    }
   public Customer(int id, String firstName, String LastName, String address, String email, String phone) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = LastName;
        this.address = address;
        this.email = email;
        this.phone = phone;


    }
    public Customer( String firstName, String LastName, String address, String email, String phone) {


        this.firstName = firstName;
        this.lastName = LastName;
        this.address = address;
        this.email = email;
        this.phone = phone;


    }

    public Customer(int id, String fname, String lname, String address, String phone) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
