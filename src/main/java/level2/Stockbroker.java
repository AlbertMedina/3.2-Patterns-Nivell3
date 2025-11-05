package level2;

import java.util.ArrayList;
import java.util.List;

public class Stockbroker {

    private final List<Brokerage> brokerages = new ArrayList<>();

    public List<Brokerage> getBrokerages() {
        return List.copyOf(brokerages);
    }

    public void addBrokerage(Brokerage brokerage) {
        brokerages.add(brokerage);
    }

    public void notifyBrokerages(String message) {
        brokerages.forEach(b -> b.update(message));
    }
}
