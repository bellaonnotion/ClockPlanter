package src;
import becker.robots.City;
import becker.robots.Direction;


public class SegmentA extends Segment {
    public SegmentA(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean a; // Define the field 'a'

    public void drawSegment() {
        if (a) {
            drawLine();
        }
    }

}
