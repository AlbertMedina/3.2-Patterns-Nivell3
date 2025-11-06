package level3;

public class CreditCardPayment implements Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with credit card: " + cardNumber);
    }
}
