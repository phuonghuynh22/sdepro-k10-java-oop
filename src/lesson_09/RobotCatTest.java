package lesson_09;

public class RobotCatTest {
    public static void main(String[] args) {

        //is-a relationship
        RobotCat solarRobotCat = new SolarRobotCat();
        solarRobotCat.setName("solarRobotCat");

        RobotCat batteryRobotCat = new BatteryRobotCat();
        batteryRobotCat.setName("batteryRobotCat");

        batteryRobotCat.sayHello();

        System.out.println(solarRobotCat.charge());
        System.out.println(batteryRobotCat.charge());

    }
}