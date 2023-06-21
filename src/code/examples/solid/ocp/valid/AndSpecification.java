package code.examples.solid.ocp.valid;

import code.examples.solid.ocp.valid.interfaces.Specification;

/**
 * This class is used for the filters where we need to consider filtering based on two criteria
 * @param <T>
 */
public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
