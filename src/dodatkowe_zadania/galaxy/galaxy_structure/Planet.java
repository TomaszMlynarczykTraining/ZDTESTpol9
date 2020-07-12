package dodatkowe_zadania.galaxy.galaxy_structure;

public class Planet extends AstralObject {

    boolean isHabitable;
    int oxygenPercent;


    public Planet(long population, double radius, boolean isHabitable) {
        super(population, radius);
        this.isHabitable = isHabitable;
        if (isHabitable) {
            population = 0;
        }
    }
}
