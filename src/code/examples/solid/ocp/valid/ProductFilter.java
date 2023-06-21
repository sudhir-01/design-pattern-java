package code.examples.solid.ocp.valid;

import code.examples.solid.ocp.enums.Product;
import code.examples.solid.ocp.valid.interfaces.Filter;
import code.examples.solid.ocp.valid.interfaces.Specification;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {


    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);  // The code inside filter() method, is a shortened version of "p -> spec.isSatisfied(p)"
    }
}
