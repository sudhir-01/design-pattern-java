package code.examples.solid.ocp.valid;

import code.examples.solid.ocp.enums.Color;
import code.examples.solid.ocp.enums.Product;
import code.examples.solid.ocp.enums.Size;

import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product car = new Product("Car", Color.RED, Size.MEDIUM);

        List<Product> products = List.of(apple, tree, house, car);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green products (new):");
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large products:");
        pf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        System.out.println("Large blue items:");
        pf.filter(products,
                        new AndSpecification<>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE)
                        ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
        
    }

}
