package org.campus02.payments;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment payment){
        payments.add(payment);
    }

    public double totalTransactionCosts(){
        double totalCosts = 0.0;

        for (Payment p : payments){
            totalCosts += p.calcTransactionCosts();
        }

        return totalCosts;
    }

    public HashMap<String, Integer> getPaymentsPerCurrency(){
        HashMap<String, Integer> result = new HashMap<>();

        for (Payment p : payments){
            // 1. Kontrollieren ob das Element/der Key vorhanden ist
            if(result.containsKey(p.getCurrency())){
                // 2. Wenn ja, manipulieren (summieren)
                Integer count = result.get(p.getCurrency());
                count++;
                // 3. Wert wieder ablegen
                result.put(p.getCurrency(), count);
            }
            // 2. Wenn nein, dann hinzufügen (Initialwert beachten)
            else{
                result.put(p.getCurrency(), 1);
            }
        }

        return result;
    }

}
