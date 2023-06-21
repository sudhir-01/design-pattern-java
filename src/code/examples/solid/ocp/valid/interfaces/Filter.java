package code.examples.solid.ocp.valid.interfaces;

import java.util.List;
import java.util.stream.Stream;

/**
 * This interface is OPEN for extension
 * @param <T>
 */
public interface Filter<T> {

    Stream<T> filter(List<T> items, Specification<T> spec);

}
