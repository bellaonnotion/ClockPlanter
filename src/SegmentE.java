package src;
import becker.robots.City;
import becker.robots.Direction;

public class SegmentE extends Segment {
    public SegmentE(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean e; // Define the field 'a'

    public void drawSegment() {
        if (e) {
            drawLine();
        }
    }
}
