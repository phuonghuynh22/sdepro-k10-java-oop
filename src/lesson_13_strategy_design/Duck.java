package lesson_13_strategy_design;

public class Duck {

    protected QuackBehavior quackBehavior;

    protected void performQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
