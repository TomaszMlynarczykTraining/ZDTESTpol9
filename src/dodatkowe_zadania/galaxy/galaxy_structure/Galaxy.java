package dodatkowe_zadania.galaxy.galaxy_structure;

public class Galaxy {

    Planet[] planets = new Planet[4];
    Moon[] moons = new Moon[3];

    public static final double AVERAGE_DENSITY = 33.4;

    public Galaxy(Planet[] planets, Moon[] moons) {
        this.planets = planets;
        this.moons = moons;
    }


    public static double calculateDensityByNumberOfPlanets(int numberOfPlanets) {
        return 1.7 * numberOfPlanets / 23 * Math.PI;

    }

    public double calculateAllSurfaces() {
        double surface = 0;

        for (Planet planet : planets) {
            //Potencjalny błąd architektoniczny
            AstralBehaviour astral = (AstralBehaviour) planet;
            surface += astral.calculateSurface();
        }

        for (Moon moon : moons) {
            surface += moon.calculateSurface();
        }

        return surface;
    }

    public void showGalaxy() {

        String output = "";

        output += " Liczba planet " + planets.length;
        output += " Liczba księżyców " + moons.length;

        System.out.println(output);

    }

    public void showPopulation() {
        int population = 0;

        for (Planet planet : planets) {
            //tak nie powinno być (powinniśmy użyć gettera)
            population += planet.population;
        }

        for (Moon moon : moons) {
            population += moon.population;
        }

        System.out.println("Summary of population " + population);
    }
}

