package lesson_09;


// Mechanism: overriding
public class BatteryRobotCat extends RobotCat{
    @Override
    public String charge() {
        return super.charge() + " with battery!";
    }
}
