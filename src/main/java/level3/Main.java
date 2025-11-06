package level3;

public class Main {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = new PaymentGateway();
        ShoeStore shoeStore = new ShoeStore(paymentGateway);

        shoeStore.buyShoes(49.99, new CreditCardPayment());
        System.out.println("-------------------------------");
        shoeStore.buyShoes(79.99, new PaypalPayment());
        System.out.println("-------------------------------");
        shoeStore.buyShoes(99.99, new BankAccountPayment());
    }
}
