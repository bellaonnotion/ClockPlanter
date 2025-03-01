package src;

import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.City;

public abstract class Segment extends RobotSE {

    public Segment(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    }

    public abstract void drawSegment();

    public void drawLine() {
        putThing();putThing();putThing();putThing();
    }


}
 