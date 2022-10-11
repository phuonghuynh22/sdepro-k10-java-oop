package lab_09_2;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public void setName(String name) {
        super.setName(name + " horse");
    }

    @Override
    public int getRandomSpeed() {
        int speed = new SecureRandom().nextInt(75);
        return speed;
    }
}
