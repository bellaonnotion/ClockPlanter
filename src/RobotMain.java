package src;
import becker.robots.City;

public class RobotMain {
    public static void main(String[] args) {
        City clockCity = new City("ClockCity.wld");

        Thread Place1 = new Thread(new RobotPlace1(clockCity));
		Thread Place2 = new Thread(new RobotPlace2(clockCity));
        Thread Place3 = new Thread(new RobotPlace3(clockCity));
        Thread Place4 = new Thread(new RobotPlace4(clockCity));
    }
    
}
