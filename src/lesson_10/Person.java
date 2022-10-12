package lesson_10;

public class Person {

    //set to private is for preventing value is changed directly from other places
    // hidden the attribute to control the invalid input to constructor
    private String name;
    private int age;

    public Person() {
    }

    private Person(String name, int age) {
        validateAge(age);
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        validateAge(age); // control the value validation
        this.age = age;
    }

    private void validateAge (int age){
        if (age < 0){
            //simulate raising an exception
            System.out.println("Incorrect input!");
        }
    }
}
