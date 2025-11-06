package level3;

public class PaymentGateway {

    public void pay(double price, Payment payment) {
        System.out.println("Processing payment...");
        payment.pay(price);
        System.out.println("Payment completed");
    }
}
