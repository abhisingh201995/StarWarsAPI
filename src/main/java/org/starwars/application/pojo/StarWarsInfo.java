package org.starwars.application.pojo;

public class StarWarsInfo {
    private Starship starship;
    private int crew;
    private boolean isLeiaOnPlanet;

    // Below is the setter methods
    public void setStarship(Starship starship) {
        this.starship = starship;
    }
    public void setCrew(int crew) {
        this.crew = crew;
    }
    public void setLeiaOnPlanet(boolean leiaOnPlanet) {
        isLeiaOnPlanet = leiaOnPlanet;
    }
}
