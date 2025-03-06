package src;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import becker.robots.*;

//heximal

public class Place3 extends Place implements Runnable {
   public City clockCity = null;

   public Place3(City cc) {
      clockCity = cc;
   }

   public void run() {

          
      String myTime3 = myTime.substring(2,3);
      int iMyTime3 = Integer.parseInt(myTime3);
      System.out.println(iMyTime3);

      Segment segment = null;

      segment = new SegmentA(clockCity, 1, 13, Direction.EAST, 100);
      segment.drawLine();
      segment = new SegmentB(clockCity, 1, 16, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentC(clockCity, 4, 16, Direction.SOUTH, 100);
      segment.drawLine();
      segment = new SegmentD(clockCity, 7, 16, Direction.WEST, 100);
      segment.drawLine();
      segment = new SegmentE(clockCity, 7, 13, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentF(clockCity, 4, 13, Direction.NORTH, 100);
      segment.drawLine();
      segment = new SegmentG(clockCity, 4, 16, Direction.WEST, 100);
      segment.drawLine();

   }

}
