package lesson_10;

public class PersonTest {
    public static void main(String[] args) {
        Person teo = new Person();

        /* due to the attributes are set to private, these line code is invalid
        teo.name = "Teo";
        teo.age = -18;
         */

        // though the input is incorrect, the exception is handled in the constructor
        teo.setAge(-18);

        //the constructor is set to private hence cannot call it
        //teo.setName
    }

    /*
    * Design Pattern
    * - Recognize problem + Solve Problem (modal)
    *
    * */
}
