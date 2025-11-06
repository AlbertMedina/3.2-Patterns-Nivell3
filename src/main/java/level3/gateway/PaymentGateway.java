package level3.gateway;

import level3.payment.Payment;

public class PaymentGateway {

    public void pay(double price, Payment payment) {
        System.out.println("Processing payment...");
        payment.pay(price);
        System.out.println("Payment completed");
    }
}
