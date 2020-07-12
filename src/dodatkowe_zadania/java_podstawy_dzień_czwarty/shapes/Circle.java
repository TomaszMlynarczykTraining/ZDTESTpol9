package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapes;

public class Circle extends Shape {

    public Circle(int[] dimensions) {
        super(dimensions, "Circle");
    }

    protected int getArea() {
        return (int) (dimensions[0] * dimensions[0] * Math.PI);
    }

    protected int getPerimeter() {
        return (int) (2 * Math.PI * dimensions[0]);
    }

}
