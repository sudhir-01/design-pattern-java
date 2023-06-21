package code.examples.solid.ocp.valid;

import code.examples.solid.ocp.enums.Product;
import code.examples.solid.ocp.enums.Size;
import code.examples.solid.ocp.valid.interfaces.Specification;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}
