package src;
import becker.robots.*;

//decimal

public class Place4 extends Place implements Runnable {
   public City clockCity = null;

   public Place4(City cc) {
      clockCity = cc;
   }

   public void run() {
      Segment segment = null;

      segment = new SegmentA(clockCity, 1, 18, Direction.EAST, 100);
      segment.drawLine();
      segment = new SegmentB(clockCity, 1, 21, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentC(clockCity, 4, 21, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentD(clockCity, 7, 21, Direction.WEST, 100);
      segment.drawLine();
      segment = new SegmentE(clockCity, 7, 18, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentF(clockCity, 4, 18, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentG(clockCity, 4, 21, Direction.WEST, 100);
      segment.drawLine();

    

   }

}
