package src;
import becker.robots.*;

//decimal

public class Place1 implements Runnable {
    public City clockCity = null;

    public Place1(City cc) {
		clockCity = cc;
	}

   public void run() {
        Segment segment = null;

        segment = new SegmentA(clockCity, 1, 1, Direction.EAST);
        segment = new SegmentB(clockCity, 1, 4, Direction.SOUTH);
        segment = new SegmentC(clockCity, 8, 4, Direction.EAST);
        segment = new SegmentD(clockCity, 1, 1, Direction.EAST);
        segment = new SegmentE(clockCity, 1, 1, Direction.EAST);
        segment = new SegmentF(clockCity, 1, 1, Direction.EAST);
        segment = new SegmentG(clockCity, 1, 1, Direction.EAST);





   }


}
