package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.List;

public interface PizzaBuilder {

    public void setSize(PizzaSize size);

    public void setDoughType(PizzaDoughType doughType);

    public void setToppings(List<String> toppings);

    public Pizza getResult();
}
