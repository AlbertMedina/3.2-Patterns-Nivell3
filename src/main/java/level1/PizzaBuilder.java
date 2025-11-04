package level1;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private List<String> toppings = new ArrayList<>();

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }

    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
