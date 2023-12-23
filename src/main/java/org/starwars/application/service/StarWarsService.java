package org.starwars.application.service;

import org.springframework.stereotype.Service;
import org.starwars.application.pojo.StarWarsInfo;
import org.starwars.application.pojo.Starship;

import java.util.Objects;

@Service
public class StarWarsService {

    public StarWarsInfo getInformation() {
        StarWarsInfo starWarsInfo = new StarWarsInfo();
        Starship starship=findStarship();
        if(Objects.isNull(starship)){
            starWarsInfo.setCrew(0);
            starWarsInfo.setStarship(starship);
        }else {
            starWarsInfo.setStarship(starship);
            starWarsInfo.setCrew(findCrew());
        }
        starWarsInfo.setLeiaOnPlanet(isLeiaOnPlanet());
        return starWarsInfo;
    }

    private Starship findStarship() {
        Starship starship = null;
        // Logic to find the Death Star starship
        // If not found, return an empty starship object {}
        if(anyStarShipExist()) {
            starship = new Starship("Death Star", "Imperial", "DS-1 Orbital Battle Station");
        }
        return starship;
    }

    private boolean anyStarShipExist() {
        //if starShipExist return true else return false [ Check in DB or any Service ]
        return true; // default is true
    }

    private int findCrew() {
        // Logic to find the crew on the Death Star
        // If no crew found, set the crew value to 0
        // For actual logic [ Check in DB or call any Service which will give the data ]
        return 15; // dummy value taken
    }

    private boolean isLeiaOnPlanet() {
        // Logic to check if Leia is on Alderaan [ actual logic is again from the DB or any service ]
        return true; // default is true
    }
}

