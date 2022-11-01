package lesson_13_strategy_design;

public class TestDuck {

    void performFly (Duck duck){
        duck.performQuack();
    }

    public static void main(String[] args) {
        new TestDuck().performFly(new MallardDuck());
        Duck decoy = new Decoy();
        decoy.setQuackBehavior(new Quack());
        new TestDuck().performFly(decoy);
        new TestDuck().performFly(new BabyDuck());
        new TestDuck().performFly(new VarianDuck());


    }
}
