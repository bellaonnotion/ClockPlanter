package src;

import becker.robots.City;
import becker.robots.Direction;

public class SegmentB extends Segment {
    public SegmentB(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean b; // Define the field 'a'

    public void drawSegment() {
        if (b) {
            drawLine();
        }
    }
}
