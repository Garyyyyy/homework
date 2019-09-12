package assignment1.transit;

public class Deposit {

    private int depositDollarsAmount;
    private int depositCentsAmount;
    private String firstName;
    private String lastName;

    public Deposit(int depositDollarsAmount, int depositCentsAmount, String firstName, String lastName) {
        this.depositDollarsAmount = depositDollarsAmount;
        this.depositCentsAmount = depositCentsAmount;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getDepositDollarsAmount() {
        return depositDollarsAmount;
    }

    public void setDepositDollarsAmount(int depositDollarsAmount) {
        this.depositDollarsAmount = depositDollarsAmount;
    }

    public int getDepositCentsAmount() {
        return depositCentsAmount;
    }

    public void setDepositCentsAmount(int depositCentsAmount) {
        this.depositCentsAmount = depositCentsAmount;
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

}
