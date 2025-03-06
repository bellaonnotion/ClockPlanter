package src;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import becker.robots.*;

//decimal

public class Place2 extends Place implements Runnable {
   public City clockCity = null;

   public Place2(City cc) {
      clockCity = cc;
   }

   public void run() {

      String myTime2 = myTime.substring(1, 2);
      int iMyTime2 = Integer.parseInt(myTime2);
      System.out.println(iMyTime2);

      Segment segment = null;

      segment = new SegmentA(clockCity, 1, 6, Direction.EAST, 100);
      segment.drawLine();
      segment = new SegmentB(clockCity, 1, 9, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentC(clockCity, 4, 9, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentD(clockCity, 7, 9, Direction.WEST, 100);
      segment.drawLine();
      segment = new SegmentE(clockCity, 7, 6, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentF(clockCity, 4, 6, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentG(clockCity, 4, 9, Direction.WEST, 100);
      segment.drawLine();

   }

}
