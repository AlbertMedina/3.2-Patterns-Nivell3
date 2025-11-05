package level1;

import level1.builder.HawaiianPizzaBuilder;
import level1.builder.ProsciuttoPizzaBuilder;
import level1.builder.VegetarianPizzaBuilder;
import level1.director.PizzaChef;

public class Main {
    public static void main(String[] args) {

        PizzaChef pizzaChef = new PizzaChef();

        ProsciuttoPizzaBuilder prosciuttoPizzaBuilder = new ProsciuttoPizzaBuilder();
        pizzaChef.buildProsciuttoPizza(prosciuttoPizzaBuilder);
        System.out.println("PROSCIUTTO");
        System.out.println(prosciuttoPizzaBuilder.getResult());

        System.out.println();

        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        pizzaChef.buildHawaiianPizza(hawaiianPizzaBuilder);
        System.out.println("HAWAIIAN");
        System.out.println(hawaiianPizzaBuilder.getResult());

        System.out.println();

        VegetarianPizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();
        pizzaChef.buildVegetarianPizza(vegetarianPizzaBuilder);
        System.out.println("VEGETARIAN");
        System.out.println(vegetarianPizzaBuilder.getResult());
    }
}
