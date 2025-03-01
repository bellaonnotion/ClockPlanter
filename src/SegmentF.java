package src;
import becker.robots.City;
import becker.robots.Direction;

public class SegmentF extends Segment {
    public SegmentF(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean f; // Define the field 'a'

    public void drawSegment() {
        if (f) {
            drawLine();
        }
    }
}
