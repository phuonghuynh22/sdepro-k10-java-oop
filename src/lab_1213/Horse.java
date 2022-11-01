package lab_1213;

import java.security.SecureRandom;

public class Horse implements MoveAble, FlyAble  {

    int  speed = new SecureRandom().nextInt(70);

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {

        return speed;
        //return 70;
    }

    @Override
    public String name() {
        return "Horse";
    }


    @Override
    public String toString() {
        return flyAble() + " " + speed;
    }
}
