package level3;

public class ShoeStore {

    private final PaymentGateway paymentGateway;

    public ShoeStore(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void buyShoes(double price, Payment payment) {
        System.out.println("Buying shoes for " + price + "€");
        paymentGateway.pay(price, payment);
        System.out.println("Purchase completed");
    }
}
