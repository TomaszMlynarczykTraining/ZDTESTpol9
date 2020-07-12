package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapesInterface;

public class ShapeMain {

    public static void main(String[] args) {

        int numberOfTotalRectangles = Rectangle.numberOfTotalRectangles;
        System.out.println(numberOfTotalRectangles);

        int[] rectangleDimensions = {23, 4};
        Rectangle rectangle = new Rectangle(rectangleDimensions);
        Rectangle rectangle2 = new Rectangle(rectangleDimensions);
        Rectangle rectangle3 = new Rectangle(rectangleDimensions);

        System.out.println(Rectangle.numberOfTotalRectangles);

        //createShapes();
    }

    private static void createShapes() {
        int[] squareDimensions = {3, 3};
        int[] rectangleDimensions = {23, 4};
        Square square = new Square(squareDimensions);
        Rectangle rectangle = new Rectangle(rectangleDimensions);

        int[] circleDimensions = {3};
        Circle circle = new Circle(circleDimensions);

        int[] triangleDimensions = {3, 4, 5, 5};
        Triangle triangle = new Triangle(triangleDimensions);


        ShapeBehaviour[][] shapes = new ShapeBehaviour[2][2];

        shapes[0][0] = square;
        shapes[0][1] = rectangle;
        shapes[1][0] = circle;

        System.out.println(triangle);

        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < shapes.length; j++) {
                System.out.println("_______________________________");
                //shapes[i][j].showShapeName();
                //shapes[i][j].showDimensions();
                System.out.println("Area is: " + shapes[i][j].getArea());
                System.out.println("Permiter is: " + shapes[i][j].getPerimeter());

            }

        }
    }
}
