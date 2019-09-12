package assignment1.transit;

import java.util.HashMap;
import java.util.Map;

public class TransitCardManagementSystem {
    public static void main(String[] args){
        Map<String, TransitCard> customerList = new HashMap<>();
        CardOwner cardOwner = new CardOwner("Yue", "Lin","ABC", "EFG");
        TransitCard transitCard = new TransitCard(cardOwner);


        if(!customerList.containsKey(cardOwner.getId())){
            customerList.put(cardOwner.getId(), transitCard);
        }else{
            customerList.get(cardOwner.getId());
        }

        System.out.println(transitCard.getCurrentBalance());


        transitCard.depositMoney(new Deposit(20,55, "Yue", "Lin"));
        System.out.println(transitCard.getCurrentBalance());

    }
}
