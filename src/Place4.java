package src;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import becker.robots.*;

//decimal

public class Place4 extends Place implements Runnable {
   public City clockCity = null;

   public Place4(City cc) {
      clockCity = cc;
   }

   public void run() {


      //what to do when one of the indexes is null (set to 0)
          
      String myTime4 = myTime.substring(3,4);
      int iMyTime4 = Integer.parseInt(myTime4);
      System.out.println(iMyTime4);


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
