package lesson1;

public class Wolf extends Animal implements CanSwim, CanRun {
    private int swimmingSpeed;
    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    private double runningSpeed;

    public Wolf(String name, String color, int age) {
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
        System.out.println("Волк воет!");
    }

    public double swim(Pool pool) {
        System.out.println("Я волк, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Волк" + "\t" + name + "\t" + color + "\t" + age ;
    }

    @Override
    public double doIt(Course course) {
        System.out.println("Я бешеный волчара, как мощны мои лапищи! , я бегу!");
        double i = 0;
        for (Obstacle obstacle: course.obstacles){
            i = i + obstacle.getLength();
        }
        double timeToOvercome = i / runningSpeed;
        System.out.println("Затратил " + timeToOvercome);
        return timeToOvercome;
    }
}
