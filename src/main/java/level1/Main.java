package level1;

public class Main {
    public static void main(String[] args) {

        PizzaChef pizzaChef = new PizzaChef();

        ProsciuttoPizzaBuilder prosciuttoPizzaBuilder = new ProsciuttoPizzaBuilder();
        pizzaChef.buildProsciuttoPizza(prosciuttoPizzaBuilder);
        System.out.println(prosciuttoPizzaBuilder.getResult());

        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        pizzaChef.buildHawaiianPizza(hawaiianPizzaBuilder);
        System.out.println(hawaiianPizzaBuilder.getResult());

        VegetarianPizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();
        pizzaChef.buildVegetarianPizza(vegetarianPizzaBuilder);
        System.out.println(vegetarianPizzaBuilder.getResult());
    }
}
