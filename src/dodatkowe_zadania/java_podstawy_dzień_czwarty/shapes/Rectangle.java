package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapes;

public class Rectangle extends Shape {

    public static int numberOfTotalRectangles = 0;

    public Rectangle(int[] dimensions) {
        super(dimensions, "Rectangle");
        numberOfTotalRectangles = numberOfTotalRectangles + 1;
    }

    protected int getArea() {
        return dimensions[0] * dimensions[1];
    }

    protected int getPerimeter() {
        return 2 * dimensions[0] + 2 * dimensions[1];
    }

}
