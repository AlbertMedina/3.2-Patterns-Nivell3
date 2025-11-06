package level3;

public class BankAccountPayment implements Payment {

    private final String iban;

    public BankAccountPayment(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with bank account: " + iban);
    }
}
