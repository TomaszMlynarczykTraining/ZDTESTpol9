package dodatkowe_zadania.galaxy.galaxy_structure;

public abstract class AstralObject {

    protected long population;
    protected double radius;

    public AstralObject(long population, double radius) {
        this.population = population;
        this.radius = radius;
    }
}
