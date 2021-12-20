package org.campus02.payments;

public class DemoPaymentApp {

    public static void main(String[] args) {

        CashPayment cp = new CashPayment(500, "EUR");
        System.out.println("cp.calcTransactionCosts(): " + cp.calcTransactionCosts());

        MaestroPayment mp = new MaestroPayment(500, "EUR", "AT12346");
        System.out.println("mp.exchangeToEUR() = " + mp.exchangeToEUR());
        System.out.println("mp.calcTransactionCosts(): " + mp.calcTransactionCosts());

        CreditCardPayment ccp = new CreditCardPayment(500, "USD", "AT55555", "6789");
        System.out.println("ccp.exchangeToEUR() = " + ccp.exchangeToEUR());
        System.out.println("ccp.calcTransactionCosts(): " + ccp.calcTransactionCosts());
        
        PaymentJournal pj = new PaymentJournal();
        pj.add(cp);
        pj.add(mp);
        pj.add(ccp);

        System.out.println("pj.totalTransactionCosts() = " + pj.totalTransactionCosts());
        System.out.println("pj.getPaymentsPerCurrency() = " + pj.getPaymentsPerCurrency());

    }

}
