package level3;

public class PaypalPayment implements Payment {

    private final String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with Paypal: " + email);
    }
}
