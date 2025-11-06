package level3;

public class PaypalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with Paypal");
    }
}
