package lesson_13_strategy_design;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mute!!!");
    }
}
