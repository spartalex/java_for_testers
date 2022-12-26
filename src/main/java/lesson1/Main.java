package lesson1;

import java.util.ArrayList;

import static lesson1.Utils.makeAnimalOlder;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1);

        Cat cat3 = new Cat("Морис", "black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Морис", "red", 10);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }

        Animal cat6 = new Cat("Морис", "red", 10);
        cat6.voice();

        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв

        Cat catCompetitor1 = new Cat("Морис", "рыжий", 10);
        catCompetitor1.setSwimmingSpeed(10);
        catCompetitor1.setRunningSpeed(17);
        Wolf wolfCompetitor1 = new Wolf("Полкан", "серый", 12);
        wolfCompetitor1.setSwimmingSpeed(12);
        wolfCompetitor1.setRunningSpeed(23);
        Turtle turtleCompetitor = new Turtle("Тортилла", "зеленая", 100);
        turtleCompetitor.setSwimmingSpeed(15);
        turtleCompetitor.setRunningSpeed(3);
        Rabbit rabbitCompetitor = new Rabbit("Роджер", "белый", 5);
        rabbitCompetitor.setSwimmingSpeed(9);
        rabbitCompetitor.setRunningSpeed(43);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor);
            pool.getTimeToOvercomePool(rabbitCompetitor);
        }

        makeAnimalOlder(cat2);

        ArrayList<Animal> competitorsList = new ArrayList<Animal>();
        competitorsList.add(catCompetitor1);
        competitorsList.add(wolfCompetitor1);
        competitorsList.add(turtleCompetitor);
        competitorsList.add(rabbitCompetitor);

        Team team =new Team("Гондольеры", competitorsList);

        Obstacle mountain = new Obstacle(30);
        Obstacle trace = new Obstacle(40);

        ArrayList<Obstacle> oList = new ArrayList<Obstacle>();
        oList.add(mountain);
        oList.add(trace);

        Course course =new Course(oList);

        System.out.println("-----------------------------------------------------------------------------------------");

        for (Animal animal : team.competitorsList) {
            course.getTimeToOvercomeCourse(animal);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(team);

        team.getCompetitorsInfo();
    }
}
