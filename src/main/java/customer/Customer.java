package customer;

public class Customer {
    private String name;
    private int idNumber; //tax id for corporates
    private String phone;

    public Customer(String name, int idNumber, String phone) {
        this.name = name;
        this.idNumber = idNumber;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
