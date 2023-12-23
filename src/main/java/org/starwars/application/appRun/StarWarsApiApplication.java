package org.starwars.application.appRun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.starwars.application.pojo.StarWarsInfo;
import org.starwars.application.service.StarWarsService;


@SpringBootApplication
public class StarWarsApiApplication {
    public static void main(String[] args) {
        //Deploy the application or to run via postman to test this use line no #13
        //SpringApplication.run(StarWarsApiApplication.class, args);

        //The below line of code helps you test your logic
        StarWarsService starWarsService = new StarWarsService();
        StarWarsInfo starWarsInfo= starWarsService.getInformation();
        System.out.println("Response is"+starWarsInfo);
    }

}
