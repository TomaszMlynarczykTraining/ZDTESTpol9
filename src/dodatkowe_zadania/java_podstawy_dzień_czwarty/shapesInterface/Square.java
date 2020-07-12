package dodatkowe_zadania.java_podstawy_dzień_czwarty.shapesInterface;

public class Square extends Rectangle {
    public Square(int[] dimensions) {
        super(dimensions);
    }

    public void showShapeName() {
        System.out.println("Name of the shape is Square");
    }

}
