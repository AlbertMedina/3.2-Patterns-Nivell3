package level2;

public class BrokerageB implements Brokerage {

    @Override
    public void update(String message) {
        System.out.println("Message received by Brokerage B: " + message);
    }
}
