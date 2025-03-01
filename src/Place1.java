package src;
import becker.robots.*;

//decimal

public class Place1 extends Place implements Runnable {
    public City clockCity = null;

    public Place1(City cc) {
		clockCity = cc;
	}

   public void run() {
        Segment segment = null;

        segment = new SegmentA(clockCity, 1, 1, Direction.EAST);
        segment = new SegmentB(clockCity, 1, 4, Direction.SOUTH);
        segment = new SegmentC(clockCity, 8, 4, Direction.SOUTH);
        segment = new SegmentD(clockCity, 12, 4, Direction.WEST);
        segment = new SegmentE(clockCity, 12, 1, Direction.NORTH);
        segment = new SegmentF(clockCity, 8, 1, Direction.NORTH);
        segment = new SegmentG(clockCity, 8, 4, Direction.WEST);
        
        segment.drawLine();





   }


}
