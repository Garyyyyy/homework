package assignment1.problem1;

public class TransitCard {
    static final int minDepositDollarAmount = 5;
    static final int maxDepositDollarAmount = 50;
    static final int minDepositCentAmount = 0;
    static final int maxDepositCentAmount = 99;

    private CardOwner cardOwner;
    private Balance balance;

    public TransitCard(CardOwner cardOwner) {
        this.cardOwner = cardOwner;
        this.balance = new Balance();
    }

    public boolean depositMoney(Deposit newDeposit){
        if(!isValidOwner(newDeposit, this.cardOwner)){
            System.out.println(" Identity couldn't be verified ! ");
            return false;
        }
        else if(!isValidAmount(newDeposit.getDepositDollarsAmount(), newDeposit.getDepositCentsAmount())){
            System.out.println("Please make sure the Deposit amount is in the range [(5 dollars, 0 cents), (50 dollars, 0 cents)] !");
            return false;
        }else{
            this.balance.deposit(newDeposit.getDepositDollarsAmount(), newDeposit.getDepositCentsAmount());
            return true;
        }
    }

    public boolean isValidAmount(int dollar, int cent){
        if(dollar < minDepositDollarAmount || dollar > maxDepositDollarAmount || cent > maxDepositCentAmount || cent < minDepositCentAmount || (dollar == maxDepositDollarAmount && cent != 0)){
            return false;
        }
        return true;
    }


    public boolean isValidOwner(Deposit newDeposit, CardOwner cardOwner){
        return newDeposit.getFirstName().toLowerCase().equals(cardOwner.getFirst_name().toLowerCase()) && newDeposit.getLastName().toLowerCase().equals(cardOwner.getLast_name().toLowerCase());
    }

    public String getCurrentBalance(){
        return this.balance.checkBalance();
    }

}
