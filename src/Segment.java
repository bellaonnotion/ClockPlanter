package src;

import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.City;

public abstract class Segment extends RobotSE {

    public Segment(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    public abstract void drawSegment();

    public void drawLine() {
        putThing();
        for (int i = 0; i < 3; i++) {
            move();
            putThing();
        }
    }


}
 