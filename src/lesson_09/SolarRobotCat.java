package lesson_09;

// Concrete class | child class
public class SolarRobotCat extends RobotCat{

    /*
    public SolarRobotCat(String name) {
        super("miumiu");
        System.out.println("meomun");
    }

     */

    // Re-implement a logic from parent's class
    @Override
    public String charge(){
        return super.charge() + " with solar!";
    }

}
