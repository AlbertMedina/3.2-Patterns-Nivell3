package level1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private final PizzaSize size;
    private final PizzaDoughType doughType;
    private final List<String> toppings;

    public Pizza(PizzaSize size, PizzaDoughType doughType, List<String> toppings) {
        this.size = size;
        this.doughType = doughType;
        this.toppings = new ArrayList<>(toppings);
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaDoughType getDoughType() {
        return doughType;
    }

    public List<String> getToppings() {
        return List.copyOf(toppings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size: ").append(size.toString().toLowerCase()).append("\nDough: ").append(doughType.toString().toLowerCase()).append("\nToppings:");
        toppings.forEach(t -> sb.append("\n  - ").append(t));
        return sb.toString();
    }
}
