package lesson_12_has_a_relationship;

public class Duck extends Animal implements ISwimAble, IFlyAble {

    @Override
    public boolean IsSwimAble() {
        return true;
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }

    @Override
    public int getSpeed() {
        return 30;
    }
}
