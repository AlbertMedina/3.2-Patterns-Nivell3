package level2.observers;

public class BrokerageB implements Brokerage {

    private final String name;

    public BrokerageB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println("Message received by " + name + " (brokerage of type B): " + message);
    }
}
