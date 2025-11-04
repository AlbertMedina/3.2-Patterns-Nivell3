package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder prosciuttoPizzaBuilder = new ProsciuttoPizzaBuilder();
        prosciuttoPizzaBuilder.setSize(PizzaSize.LARGE);
        prosciuttoPizzaBuilder.setDoughType(PizzaDoughType.THICK);

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        hawaiianPizzaBuilder.setSize(PizzaSize.MEDIUM);
        hawaiianPizzaBuilder.setDoughType(PizzaDoughType.THIN);

        PizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();
        vegetarianPizzaBuilder.setSize(PizzaSize.SMALL);
        vegetarianPizzaBuilder.setDoughType(PizzaDoughType.NEAPOLITAN);
    }
}
