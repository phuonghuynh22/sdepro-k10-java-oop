package lesson_10;

/*
* static members cannot access non-static members
* */
public class RobotDog {

    // class variable
    // being used of all constructors below
    public static int dogId = 0;

    public String name;

    public RobotDog() {
        dogId++;
    }

    //object
    public int getDogId() {
        sayHello();
        return dogId;
    }

    //class method
    // called directly from class
    public static void sayHello(){
        System.out.println("hELLo there !".concat(" , my name is "));

        // unable to call this.name here
        //System.out.println("hELLo there !".concat(" , my name is ").concat(this.name));
    }

    public static void main(String[] args) {
        RobotDog dog1 = new RobotDog();
        System.out.println("Dog ID: " + dog1.getDogId());

        //in case moving the below line code before the println above, 2 print out values are the same = 2
        RobotDog dog2 = new RobotDog();
        System.out.println("Dog ID: " + dog2.getDogId());
    }


    /* question:
     * Can a class member be overridden? OR Can we override the static variable, static class?
     *
     * Answer:
     *  - Override is used under the inheritance context
     *  - Able to override class variable
     *      - How: via static block {}
     */
}
