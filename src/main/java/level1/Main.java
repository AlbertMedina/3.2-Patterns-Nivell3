package level1;

import level1.director.PizzaChef;

public class Main {
    public static void main(String[] args) {

        PizzaChef pizzaChef = new PizzaChef();
        
        System.out.println(pizzaChef.buildProsciuttoPizza());
        System.out.println("--------------------------------------------------");
        System.out.println(pizzaChef.buildHawaiianPizza());
        System.out.println("--------------------------------------------------");
        System.out.println(pizzaChef.buildVegetarianPizza());
    }
}
