package dodatkowe_zadania.galaxy.galaxy_structure;

public class NormalPlanet extends Planet implements AstralBehaviour {


    public NormalPlanet(long population, double radius, boolean isHabitable) {
        super(population, radius, isHabitable);
    }

    @Override
    public double calculateSurface() {
        return 2 * Math.PI * (radius * radius) * 2;
    }
}
