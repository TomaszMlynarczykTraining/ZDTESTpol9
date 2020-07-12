package dodatkowe_zadania.galaxy.galaxy_structure;

public class Moon extends AstralObject implements AstralBehaviour {

    int numberOfCraters;

    public Moon(long population, double radius) {
        super(population, radius);
    }

    @Override
    public double calculateSurface() {
        return radius * 7;
    }
}
