package level1;

import level1.director.PizzaChef;
import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    void shouldBuildProsciuttoPizza() {
        PizzaChef pizzaChef = new PizzaChef();
        Pizza pizza = pizzaChef.buildProsciuttoPizza();
        assertEquals("prosciutto", pizza.getName());
        assertEquals(PizzaSize.LARGE, pizza.getSize());
        assertEquals(PizzaDoughType.THICK, pizza.getDoughType());
        assertEquals(3, pizza.getToppings().size());
        assertEquals("tomato", pizza.getToppings().get(0));
        assertEquals("mozzarella", pizza.getToppings().get(1));
        assertEquals("ham", pizza.getToppings().get(2));
    }

    @Test
    void shouldBuildHawaiianPizza() {
        PizzaChef pizzaChef = new PizzaChef();
        Pizza pizza = pizzaChef.buildHawaiianPizza();
        assertEquals("hawaiian", pizza.getName());
        assertEquals(PizzaSize.MEDIUM, pizza.getSize());
        assertEquals(PizzaDoughType.THIN, pizza.getDoughType());
        assertEquals(4, pizza.getToppings().size());
        assertEquals("tomato", pizza.getToppings().get(0));
        assertEquals("mozzarella", pizza.getToppings().get(1));
        assertEquals("ham", pizza.getToppings().get(2));
        assertEquals("pineapple", pizza.getToppings().get(3));
    }

    @Test
    void shouldBuildVegetarianPizza() {
        PizzaChef pizzaChef = new PizzaChef();
        Pizza pizza = pizzaChef.buildVegetarianPizza();
        assertEquals("vegetarian", pizza.getName());
        assertEquals(PizzaSize.SMALL, pizza.getSize());
        assertEquals(PizzaDoughType.NEAPOLITAN, pizza.getDoughType());
        assertEquals(4, pizza.getToppings().size());
        assertEquals("tomato", pizza.getToppings().get(0));
        assertEquals("mozzarella", pizza.getToppings().get(1));
        assertEquals("mushrooms", pizza.getToppings().get(2));
        assertEquals("vegetables", pizza.getToppings().get(3));
    }
}
