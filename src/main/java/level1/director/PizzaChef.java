package level1.director;

import level1.builder.HawaiianPizzaBuilder;
import level1.builder.ProsciuttoPizzaBuilder;
import level1.builder.VegetarianPizzaBuilder;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.List;

public class PizzaChef {

    public void buildProsciuttoPizza(ProsciuttoPizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(PizzaSize.LARGE);
        pizzaBuilder.setDoughType(PizzaDoughType.THICK);
        pizzaBuilder.setToppings(List.of("tomato", "mozzarella", "ham"));
    }

    public void buildHawaiianPizza(HawaiianPizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(PizzaSize.MEDIUM);
        pizzaBuilder.setDoughType(PizzaDoughType.THIN);
        pizzaBuilder.setToppings(List.of("tomato", "mozzarella", "ham", "pineapple"));
    }

    public void buildVegetarianPizza(VegetarianPizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize(PizzaSize.SMALL);
        pizzaBuilder.setDoughType(PizzaDoughType.NEAPOLITAN);
        pizzaBuilder.setToppings(List.of("tomato", "mozzarella", "mushrooms", "vegetables"));
    }
}
