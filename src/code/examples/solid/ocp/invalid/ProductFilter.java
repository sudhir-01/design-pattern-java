package code.examples.solid.ocp.invalid;

import code.examples.solid.ocp.enums.Color;
import code.examples.solid.ocp.enums.Product;
import code.examples.solid.ocp.enums.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    /**
     * It filters the product based on colors. This method exists since inception of ProductFilter class
     * @param products
     * @param color
     * @return
     */
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.color == color);
    }

    /**
     * It filters the product based on sizes. This method exists since inception of ProductFilter class
     * @param products
     * @param size
     * @return
     */
    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.size == size);
    }

    /**
     * It filters the product based on Colors & sizes together. This method was created later based on new requirements.
     * Similarly, if another filter criteria comes up then we need to create a new method in this class and that's how we
     * break the OCP. Ideally, we should be closed for MODIFICATIONS and open for EXTENSIONS as per OCP but, we are keep
     * on modifying same class here which is a violation of OCP
     *
     * @param products
     * @param color
     * @param size
     * @return
     */
    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size){
        return products.stream().filter(p -> p.color == color && p.size == size);
    }

}
