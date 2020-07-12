package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapesInterface;

public abstract class Shape {

    public static final double PI_NUMBER = 3.14;
    protected int[] dimensions;
    private String name;

    public Shape(int[] dimensions, String name) {
        this.dimensions = dimensions;
        this.name = name;
    }

    protected void showDimensions() {
        if (dimensions.length > 0) {
            System.out.println("Dimensions are: ");
            for (int dimension : dimensions) {
                System.out.println("Dimension is " + dimension);
            }
        } else {
            System.out.println("There are no dimensions on this shape");
        }
    }


    public void showShapeName() {
        System.out.println("Name of the shape is " + name);
    }
}
