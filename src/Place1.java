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

        segment = new SegmentA(clockCity, 1, 1, Direction.EAST, 100);
        segment.drawLine();


        segment = new SegmentB(clockCity, 1, 4, Direction.SOUTH, 100);
        segment.drawLine();


        segment = new SegmentC(clockCity, 4, 4, Direction.SOUTH, 100);
        segment.drawLine();


        segment = new SegmentD(clockCity, 7, 4, Direction.WEST, 100);
        segment.drawLine();


        segment = new SegmentE(clockCity, 7, 1, Direction.NORTH, 100);
        segment.drawLine();


        segment = new SegmentF(clockCity, 4, 1, Direction.NORTH, 100);
        segment.drawLine();

        
        segment = new SegmentG(clockCity, 4, 4, Direction.WEST, 100);
        segment.drawLine();





   }


}
