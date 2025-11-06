package level3;

public class BankAccountPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with bank account");
    }
}
