package level1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private PizzaSize size;
    private PizzaDoughType doughType;
    private List<String> toppings = new ArrayList<>();

    public Pizza(PizzaSize size, PizzaDoughType doughType, List<String> toppings) {
        this.size = size;
        this.doughType = doughType;
        this.toppings = new ArrayList<>(toppings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size: ").append(size.toString().toLowerCase()).append("\nDough: ").append(doughType.toString().toLowerCase()).append("\nToppings:");
        toppings.forEach(t -> sb.append("\n  - ").append(t));
        return sb.toString();
    }
}
