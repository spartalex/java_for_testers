package lesson1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(50), new Water(5), new Wall(9));
        Team team = new Team("First", new Human("Дима"), new Cat("Барсик"), new Dog("Шарик"));
        c.doIt(team);

        System.out.println("Победители:");
        team.passedTheDistance();

        System.out.println("Результат:");// Показываем результаты
        team.showResults();
    }
}