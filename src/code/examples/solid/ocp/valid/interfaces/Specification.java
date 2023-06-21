package code.examples.solid.ocp.valid.interfaces;

/**
 * This interface is OPEN for extension
 * @param <T>
 */
public interface Specification<T> {

    boolean isSatisfied(T item);

}
