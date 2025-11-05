package level1.director;

import level1.builder.HawaiianPizzaBuilder;
import level1.builder.ProsciuttoPizzaBuilder;
import level1.builder.VegetarianPizzaBuilder;
import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

public class PizzaChef {

    public Pizza buildProsciuttoPizza() {
        return new ProsciuttoPizzaBuilder()
                .setSize(PizzaSize.LARGE)
                .setDoughType(PizzaDoughType.THICK)
                .addTopping("tomato")
                .addTopping("mozzarella")
                .addTopping("ham")
                .getResult();
    }

    public Pizza buildHawaiianPizza() {
        return new HawaiianPizzaBuilder()
                .setSize(PizzaSize.MEDIUM)
                .setDoughType(PizzaDoughType.THIN)
                .addTopping("tomato")
                .addTopping("mozzarella")
                .addTopping("ham")
                .addTopping("pineapple")
                .getResult();
    }

    public Pizza buildVegetarianPizza() {
        return new VegetarianPizzaBuilder()
                .setSize(PizzaSize.SMALL)
                .setDoughType(PizzaDoughType.NEAPOLITAN)
                .addTopping("tomato")
                .addTopping("mozzarella")
                .addTopping("mushrooms")
                .addTopping("vegetables")
                .getResult();
    }
}
