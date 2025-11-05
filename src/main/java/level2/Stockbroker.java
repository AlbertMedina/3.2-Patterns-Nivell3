package level2;

import java.util.ArrayList;
import java.util.List;

public class Stockbroker {

    private final List<Brokerage> brokerages = new ArrayList<>();

    private String stocksState;

    public List<Brokerage> getBrokerages() {
        return List.copyOf(brokerages);
    }

    public String getStocksState() {
        return stocksState;
    }

    public void addBrokerage(Brokerage brokerage) {
        brokerages.add(brokerage);
    }

    public void updateStocksState(String state) {
        stocksState = state;
        notifyBrokerages(stocksState);
    }

    private void notifyBrokerages(String message) {
        brokerages.forEach(b -> b.update(message));
    }
}
