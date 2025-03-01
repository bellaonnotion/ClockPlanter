package src;
import becker.robots.City;
import becker.robots.Direction;

public class SegmentC extends Segment {
    public SegmentC(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean c; // Define the field 'a'

    public void drawSegment() {
        if (c) {
            drawLine();
        }
    }
}
