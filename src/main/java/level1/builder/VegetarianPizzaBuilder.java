package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private List<String> toppings = new ArrayList<>();

    @Override
    public VegetarianPizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public VegetarianPizzaBuilder setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public VegetarianPizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
