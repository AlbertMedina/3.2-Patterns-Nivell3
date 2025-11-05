package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private List<String> toppings = new ArrayList<>();

    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
    }

    @Override
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
