package lab_1213;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {

    int  speed = new SecureRandom().nextInt(50);

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {

        return speed;
        //return 50;
    }
    @Override
    public String name() {
        return "Dog";
    }

    @Override
    public String toString() {
        return flyAble() + " " + speed;
    }
}
