package lesson_13_strategy_design;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack quack!!!");
    }
}
