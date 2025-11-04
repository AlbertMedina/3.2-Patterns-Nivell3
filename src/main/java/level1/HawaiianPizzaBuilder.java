package level1;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {

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
        this.toppings = List.of("tomato", "mozzarella", "ham", "pineapple");
    }

    @Override
    public Pizza getResult() {
        return new Pizza(size, doughType, toppings);
    }
}
