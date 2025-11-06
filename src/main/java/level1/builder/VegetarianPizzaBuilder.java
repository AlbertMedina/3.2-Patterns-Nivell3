package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private final List<String> toppings = new ArrayList<>();

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
    public VegetarianPizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza("vegetarian", size, doughType, toppings);
    }
}
