package level2;

import level2.observers.BrokerageA;
import level2.observers.BrokerageB;
import level2.subject.Stockbroker;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    void shouldStockbrokerUpdateStocksState() {
        Stockbroker stockbroker = new Stockbroker();
        stockbroker.updateStocksState("test-state");
        assertEquals("test-state", stockbroker.getStocksState());
    }

    @Test
    void shouldAddBrokerages() {
        Stockbroker stockbroker = new Stockbroker();
        stockbroker.addBrokerage(new BrokerageA("test-brokerage"));
        stockbroker.addBrokerage(new BrokerageB("test-brokerage-2"));
        assertEquals(2, stockbroker.getBrokerages().size());
        assertEquals("test-brokerage", ((BrokerageA) stockbroker.getBrokerages().get(0)).getName());
        assertEquals("test-brokerage-2", ((BrokerageB) stockbroker.getBrokerages().get(1)).getName());
    }

    @Test
    void shouldStockbrokerNotifyBrokerages() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Stockbroker stockbroker = new Stockbroker();
        stockbroker.addBrokerage(new BrokerageA("test-brokerage"));
        stockbroker.updateStocksState("test-state");
        assertEquals("Message received by test-brokerage (brokerage of type A): test-state", outputStream.toString().trim());
    }
}
