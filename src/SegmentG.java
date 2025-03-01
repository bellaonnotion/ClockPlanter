package src;
import becker.robots.City;
import becker.robots.Direction;

public class SegmentG extends Segment {
    public SegmentG(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean g; // Define the field 'a'

    public void drawSegment() {
        if (g) {
            drawLine();
        }
    }
}
