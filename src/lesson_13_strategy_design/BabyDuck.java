package lesson_13_strategy_design;

public class BabyDuck extends Duck{
    public BabyDuck() {
        quackBehavior =  new Squeak();
    }
}
