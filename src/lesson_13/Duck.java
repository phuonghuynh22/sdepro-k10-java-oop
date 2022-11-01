package lesson_13;

public class Duck implements ISwimAble{

    @Override
    public void doSth() {

    }

    @Override
    public void doAnother() {
        ISwimAble.super.doAnother();
    }
}
