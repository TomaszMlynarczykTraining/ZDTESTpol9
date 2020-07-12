package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapesInterface;

public class Circle extends Shape implements ShapeBehaviour {

    public Circle(int[] dimensions) {
        super(dimensions, "Circle");
    }

    public int getArea() {
        return (int) (dimensions[0] * dimensions[0] * Math.PI);
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * dimensions[0]);
    }

}
