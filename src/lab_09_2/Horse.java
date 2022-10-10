package lab_09_2;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    public int getRandomSpeed() {
        int horseSpeed = new SecureRandom().nextInt(75);
        //int msxSpeed = 75;

        return horseSpeed;
    }
}
