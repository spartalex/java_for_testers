package lesson1;

import java.util.ArrayList;

public class Team {
    public String name;


    public Team(String name, ArrayList<Animal> competitorsList) {
        this.name = name;
        this.competitorsList = competitorsList;
    }


    public ArrayList<Animal> competitorsList;

    public void getWinnersInfo() {
        for (Animal animal : competitorsList) {
            System.out.println(animal);
        }
    }

    public void getCompetitorsInfo() {
        for (Animal animal : competitorsList) {
            System.out.println(animal);
        }
    }
    @Override
    public String toString() {
        return "Команда:" + name;
    }
}

