package lab_09_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    public int getRandomSpeed() {
        int tigerSpeed = new SecureRandom().nextInt(100);
        return tigerSpeed;
    }
}
