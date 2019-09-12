package assignment1.problem1;

public class CardOwner {

    private String first_name;
    private String last_name;
    private String address;
    private String email;
    private String id;

    public CardOwner(String first_name, String last_name, String address, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.id = (first_name+last_name).toLowerCase();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public String getId() {
        return id;
    }
}
