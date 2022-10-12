package lesson_10;

public class SolarRobotDog extends RobotDog{

    //static blocks - can be overridden
    static {
        dogId = 10;
    }


    // but...
    // this method is not overridden
    public static void sayHello() {
        System.out.println("hELLo there !".concat(" , my name is "));
    }
}
