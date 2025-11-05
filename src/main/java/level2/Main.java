package level2;

public class Main {
    public static void main(String[] args) {

        Stockbroker stockbroker = new Stockbroker();

        stockbroker.addBrokerage(new BrokerageA());
        stockbroker.addBrokerage(new BrokerageB());
        stockbroker.updateStocksState("Stocks up!");
    }
}
