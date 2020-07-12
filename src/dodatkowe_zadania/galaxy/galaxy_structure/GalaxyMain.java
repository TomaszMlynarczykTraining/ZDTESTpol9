package dodatkowe_zadania.galaxy.galaxy_structure;

public class GalaxyMain {

    public static void main(String[] args) {
        DwarfPlanet earth = new DwarfPlanet(123, 2.4, true);
        NormalPlanet normalPlanet = new NormalPlanet(200, 52.3, false);

        Moon moon = new Moon(2323, 2.4);


        Planet[] planets = {earth, normalPlanet};
        Moon[] moons = {moon};


        Galaxy galaxy = new Galaxy(planets, moons);

        System.out.println("Density for 4 plantes is " + Galaxy.calculateDensityByNumberOfPlanets(4));
        System.out.println("Sum of surfaces is " + galaxy.calculateAllSurfaces());
        galaxy.showGalaxy();
        galaxy.showPopulation();


    }
}
