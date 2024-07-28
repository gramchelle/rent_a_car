package customer;

public class IndividualCustomer extends Customer{ // can rent only sedan and hatchbacks
    private String surname;

    public IndividualCustomer(String name, String surname, int idNumber, String phone) {
        super(name, idNumber, phone);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
