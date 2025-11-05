package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.List;

public interface PizzaBuilder {

    PizzaBuilder setSize(PizzaSize size);

    PizzaBuilder setDoughType(PizzaDoughType doughType);

    PizzaBuilder setToppings(List<String> toppings);

    Pizza getResult();
}
