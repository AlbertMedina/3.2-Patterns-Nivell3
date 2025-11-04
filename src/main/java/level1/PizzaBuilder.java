package level1;

import java.util.ArrayList;
import java.util.List;

public interface PizzaBuilder {

    void setSize(PizzaSize size);

    void setDoughType(PizzaDoughType doughType);

    void setToppings();

    Pizza getResult();
}
