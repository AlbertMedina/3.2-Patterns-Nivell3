package level1;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private List<String> toppings = new ArrayList<>();

    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void setDoughType(PizzaDoughType doughType) {
        this.doughType = doughType;
    }

    @Override
    public void setToppings() {
        this.toppings = List.of("tomato", "mozzarella", "mushrooms", "vegetables");
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
