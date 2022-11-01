package lab_1213;

import java.security.SecureRandom;

public class Eagle implements FlyAble, MoveAble{

    int  speed = new SecureRandom().nextInt(60);

    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int speed() {

        return speed;
        //return 60;
    }

    @Override
    public String name() {
        return "Eagle";
    }
    @Override
    public String toString() {
        return flyAble() + " " + speed;
    }
}
