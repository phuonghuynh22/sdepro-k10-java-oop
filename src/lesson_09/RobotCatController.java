package lesson_09;

import java.util.Arrays;
import java.util.List;

//Functional programming
public class RobotCatController {

    // Process IS-A relationship | Controller
    public void chargeRobotList (List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }

    public static void main(String[] args) {

        //Data to test
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat windRobotCat = new WindRobotCat();

        //Calling controller to process object data
        List<RobotCat> robotCatList = Arrays.asList(solarRobotCat, batteryRobotCat, windRobotCat);
        RobotCatController controller = new RobotCatController();
        controller.chargeRobotList(robotCatList);

    }

}
