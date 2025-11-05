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
    public HawaiianPizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public HawaiianPizzaBuilder setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public HawaiianPizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
