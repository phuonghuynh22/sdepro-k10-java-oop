package lesson_13_strategy_design;

public class Speak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Hello there");

    }
}
