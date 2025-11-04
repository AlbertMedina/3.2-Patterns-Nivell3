package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder prosciuttoPizzaBuilder = new PizzaBuilder();
        prosciuttoPizzaBuilder.setSize(PizzaSize.LARGE);
        prosciuttoPizzaBuilder.setDoughType(PizzaDoughType.THICK);
        prosciuttoPizzaBuilder.setToppings(List.of("tomato", "mozzarella", "ham"));

        PizzaBuilder hawaiianPizzaBuilder = new PizzaBuilder();
        hawaiianPizzaBuilder.setSize(PizzaSize.MEDIUM);
        hawaiianPizzaBuilder.setDoughType(PizzaDoughType.THIN);
        hawaiianPizzaBuilder.setToppings(List.of("tomato", "mozzarella", "ham", "pineapple"));

        PizzaBuilder vegetarianPizzaBuilder = new PizzaBuilder();
        vegetarianPizzaBuilder.setSize(PizzaSize.SMALL);
        vegetarianPizzaBuilder.setDoughType(PizzaDoughType.NEAPOLITAN);
        vegetarianPizzaBuilder.setToppings(List.of("tomato", "mozzarella", "mushrooms", "vegetables"));
    }
}
