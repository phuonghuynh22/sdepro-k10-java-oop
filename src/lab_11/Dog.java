package lab_11;

import java.security.SecureRandom;

public class Dog extends Animal {

    @Override
    public void setName(String name) {
        super.setName(name + " dog");
    }

    @Override
    public int getRandomSpeed() {
        int speed = new SecureRandom().nextInt(60);
        return speed;
    }
}
