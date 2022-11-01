package lesson_13_strategy_design;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak chip !!!");
    }
}
