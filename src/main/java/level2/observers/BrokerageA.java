package level2.observers;

public class BrokerageA implements Brokerage {

    private final String name;

    public BrokerageA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Message received by " + name + " (brokerage of type A): " + message);
    }
}
