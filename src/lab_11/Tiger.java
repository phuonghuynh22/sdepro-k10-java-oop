package lab_11;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public void setName(String name) {
        super.setName(name + " tiger");
    }

    @Override
    public int getRandomSpeed() {
        int speed = new SecureRandom().nextInt(100);
        return speed;
    }
}
