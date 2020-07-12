package dodatkowe_zadania.java_podstawy_dzien_trzeci.oop;

public class Room {
    private int height;
    private int width;
    private double length;

    public Room(int height, int width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Room(int height, int width) {
        this.height = height;
        this.width = width;
        this.length = 2.4;
    }


    public void showSurface() {
        System.out.println("Powierzchnia to " + calculateSurface());
    }


    public void showVolume() {
        System.out.println("Objetosc to " + calculateVolume());
    }

    private double calculateSurface() {
        return (2 * height * length) +
                (2 * length * width) + (2 * length * width);
    }

    private double calculateVolume() {
        return height * length * width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return this.width;
    }

    public double getLength() {
        return length;
    }
}
