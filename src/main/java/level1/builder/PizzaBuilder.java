package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

public interface PizzaBuilder {

    PizzaBuilder setSize(PizzaSize size);

    PizzaBuilder setDoughType(PizzaDoughType doughType);

    PizzaBuilder addTopping(String topping);

    Pizza getResult();
}
