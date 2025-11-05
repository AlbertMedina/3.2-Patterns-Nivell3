package level2;

public class BrokerageA implements Brokerage {

    @Override
    public void update(String message) {
        System.out.println("Message received by Brokerage A: " + message);
    }
}
