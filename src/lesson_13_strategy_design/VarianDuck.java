package lesson_13_strategy_design;

public class VarianDuck extends Duck {
    public VarianDuck() {
        quackBehavior = new Speak();
    }
}
