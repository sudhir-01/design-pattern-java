package code.examples.solid.ocp.valid;

import code.examples.solid.ocp.enums.Color;
import code.examples.solid.ocp.enums.Product;
import code.examples.solid.ocp.valid.interfaces.Specification;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color == color;
    }
}
