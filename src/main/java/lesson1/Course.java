package lesson1;

import java.util.ArrayList;

public class Course {

    public ArrayList<Obstacle> obstacles;

    public Course(ArrayList<Obstacle> oList) {
        this.obstacles = oList;
    }

    public void getTimeToOvercomeCourse(CanRun runner){
        runner.doIt(this);
    }
}
