package level3;

import level3.gateway.PaymentGateway;
import level3.payment.BankAccountPayment;
import level3.payment.CreditCardPayment;
import level3.payment.PaypalPayment;
import level3.store.ShoeStore;

public class Main {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        shoeStore.buyShoes(49.99, new CreditCardPayment("1111222233334444"));
        System.out.println("-------------------------------");
        shoeStore.buyShoes(79.99, new PaypalPayment("customer@example.com"));
        System.out.println("-------------------------------");
        shoeStore.buyShoes(99.99, new BankAccountPayment("ES0011112222333344445555"));
    }
}
