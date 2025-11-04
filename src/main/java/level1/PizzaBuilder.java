package level1;

import java.util.ArrayList;
import java.util.List;

public interface PizzaBuilder {

    public void setSize(PizzaSize size);

    public void setDoughType(PizzaDoughType doughType);

    public void setToppings(List<String> toppings);

    public Pizza getResult();
}
