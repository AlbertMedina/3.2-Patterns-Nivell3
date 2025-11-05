package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class ProsciuttoPizzaBuilder implements PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private final List<String> toppings = new ArrayList<>();

    @Override
    public ProsciuttoPizzaBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public ProsciuttoPizzaBuilder setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
        return this;
    }

    @Override
    public ProsciuttoPizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
