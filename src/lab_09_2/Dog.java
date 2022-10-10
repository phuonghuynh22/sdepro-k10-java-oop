package lab_09_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    public int getRandomSpeed() {
        int dogSpeed = new SecureRandom().nextInt(60);
        //int msxSpeed = 60;
        return dogSpeed;
    }
}
