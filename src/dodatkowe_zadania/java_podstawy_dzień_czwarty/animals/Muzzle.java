package dodatkowe_zadania.java_podstawy_dzień_czwarty.animals;

public class Muzzle {

    private String type;
    private int size;
    private boolean isPreventingFromTicks;

    public Muzzle(String type, int size, boolean isPreventingFromTicks) {
        this.type = type;
        this.size = size;
        this.isPreventingFromTicks = isPreventingFromTicks;
    }

    @Override
    public String toString() {
        return "Muzzle{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", isPreventingFromTicks=" + isPreventingFromTicks +
                '}';
    }
}
