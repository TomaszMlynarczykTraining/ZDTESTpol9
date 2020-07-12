package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapes;

public class Triangle extends Shape {


    public Triangle(int[] dimensions) {
        super(dimensions, "Triangle");
    }


    protected int getArea() {
        return (int) (0.5 * dimensions[0] * dimensions[3]);
    }

    protected int getPerimeter() {
        return dimensions[0] + dimensions[1] + dimensions[2];
    }

    @Override
    public String toString() {
        return "Area is " + getArea() + " and perimiter is " + getPerimeter();
    }
}
