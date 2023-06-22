package code.examples.solid.lsp;

/**
 * In this example, we have a Rectangle class and a Square class that extends Rectangle. According to Liskov's Substitution Principle,
 * objects of the subtype (in this case, Square) should be able to be substituted for objects of the base type (Rectangle) without affecting
 * the correctness of the program. The Rectangle class has setWidth and setHeight methods for setting the dimensions, and the getArea method
 * calculates and returns the area. The Square class overrides the setWidth and setHeight methods to ensure that both width and height are
 * always the same. This violates the Liskov's Substitution Principle because it changes the behavior of the base class. If we substitute a
 * Square object for a Rectangle object, the expected behavior (in terms of width and height) will be different. In the Main class, we demonstrate
 * the violation of Liskov's Substitution Principle. When we call printArea method with a Rectangle object and a Square object, we get different
 * results because the behavior of the overridden methods in Square is different from the expected behavior of the base class.
 */


class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

class AreaCalculator {
    public static void printArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Area: " + rectangle.getArea());
    }
}

public class LSPDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        AreaCalculator.printArea(rectangle); // Output: Area: 50

        Square square = new Square();
        AreaCalculator.printArea(square); // Output: Area: 100
    }
}
