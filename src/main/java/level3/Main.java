package level3;

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
