package lesson_08;

public class RobotCatTest {
    public static void main(String[] args) {

        //meomeo is an object which is created from the RobotCat class (Template/Blueprint/Design)
        //by calling Constructor to create an object
        //Though there is no Constructor or any method in RobotCat class, this main method is still able to run successfully
        //because Java automatically created a Constructor RobotCat() in the "out" folder in IDE
        RobotCat meomeo = new RobotCat("meomeomeo");
        System.out.println(meomeo.getName());
        meomeo.setName("doremon");
        System.out.println(meomeo.getName());
    }
}
