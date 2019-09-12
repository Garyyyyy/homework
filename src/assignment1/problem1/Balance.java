package assignment1.problem1;

public class Balance {
    private int balanceDollarsAmount;
    private int balanceCentsAmount;

    public Balance() {}

    public Balance(int balanceDollarsAmount, int balanceCentsAmount) {
        this.balanceDollarsAmount = balanceDollarsAmount;
        this.balanceCentsAmount = balanceCentsAmount;
    }

    public int getBalanceDollarsAmount() {
        return balanceDollarsAmount;
    }

    public void setBalanceDollarsAmount(int balanceDollarsAmount) {
        this.balanceDollarsAmount = balanceDollarsAmount;
    }

    public int getBalanceCentsAmount() {
        return balanceCentsAmount;
    }

    public void setBalanceCentsAmount(int balanceCentsAmount) {
        this.balanceCentsAmount = balanceCentsAmount;
    }

    public void deposit(int dollars, int cents){
        int mod = cents / 99;
        int remainder = cents % 99;
        balanceDollarsAmount = balanceDollarsAmount + dollars + mod;
        balanceCentsAmount += remainder;
    }

    public String checkBalance(){
        return Integer.toString(balanceDollarsAmount) + "." + Integer.toString(balanceCentsAmount);
    }


}
