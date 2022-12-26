package lesson1;

import java.util.Objects;

public class Rabbit extends Animal implements CanSwim, CanRun{

    public Rabbit(String name, String color, int age) {
        super(name, color, age);
        this.name = name;
        this.color = color;
    }
    public Rabbit(){
        super("Роджер", "Белый",5);
    }
    private boolean isWild;
    private double swimmingSpeed;
    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    private double runningSpeed;

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rabbit setColorBuild(String color) {
        this.color = color;
        return this;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректное значение!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Кролик" + "\t" + name + "\t" + color + "\t" + age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit rabbit = (Rabbit) o;
        return age == rabbit.age &&
                Objects.equals(name, rabbit.name) &&
                Objects.equals(color, rabbit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("Кролик пищит!");
    }

    public double swim(Pool pool) {
        System.out.println("Я кролик, я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(1);
        rabbit.setWild(true);
        rabbit.setSwimmingSpeed(4);

        rabbit.setColorBuild("white").setWild(true);
    }

    @Override
    public double doIt(Course course) {
        System.out.println("Я кроль, я бегу!");
        double i = 0;
        for (Obstacle obstacle: course.obstacles){
            i = i + obstacle.getLength();
        }
        double timeToOvercome = i / runningSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }
}
