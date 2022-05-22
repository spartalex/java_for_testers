package lesson1;

public class Human extends Animal implements CanSwim {
    private int swimSpeed;
    private int runSpeed;
    public Human(String name, String color, int age){
        super (name, color, age);
       this.name=name;
       this.color=color;
       this.age=age;
    }

    public void voice() {
        System.out.println("Человек кричит");}

        public int getSwimSpeed () {
            return swimSpeed;
        }

        public void setSwimSpeed ( int swimSpeed){
            this.swimSpeed = swimSpeed;
        }

        public int getRunSpeed () {
            return runSpeed;
        }

        public void setRunSpeed ( int runSpeed){
            this.runSpeed = runSpeed;
        }
        public double swim(Pool pool){
            double timeToOvercome = pool.getLength() / swimSpeed;
            System.out.println(timeToOvercome);
            return timeToOvercome;
        }


}