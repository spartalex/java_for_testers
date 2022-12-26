package lesson1;

public class Turtle extends Animal implements CanSwim, CanRun {
    private int swimmingSpeed;
    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    private double runningSpeed;

    public Turtle(String name, String color, int age, int swimmingSpeed) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук!");
    }

    public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Черпаха" + "\t" + name + "\t" + color + "\t" + age ;
    }

    @Override
    public double doIt(Course course) {
        System.out.println("Я черепаха, я ползу!");
        double i = 0;
        for (Obstacle obstacle: course.obstacles){
            i = i + obstacle.getLength();
        }
        double timeToOvercome = i / runningSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }
}
