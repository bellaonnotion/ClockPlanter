package src;
import becker.robots.City;
import becker.robots.Direction;

public class SegmentD extends Segment {
    public SegmentD(City city, int street, int avenue, Direction direction, int numThings) {
        super(city, street, avenue, direction, numThings);
    }

    private boolean d; // Define the field 'a'

    public void drawSegment() {
        if (d) {
            drawLine();
        }
    }
}
