package src;
import becker.robots.City;

public class RobotMain {
    public static void main(String[] args) {
        City clockCity = new City("ClockCity.wld");

        Thread place1 = new Thread(new Place1(clockCity));
		Thread place2 = new Thread(new Place2(clockCity));
        Thread place3 = new Thread(new Place3(clockCity));
        Thread place4 = new Thread(new Place4(clockCity));

        place1.start();
        place2.start();
        place3.start();
        place4.start();

    }
    
}
