package lab_10;

import java.security.SecureRandom;

public class Animal {

    private String name =  "";
    private int speed = 0;
    private boolean flyable = true;

    protected Animal(Builder builder){
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    // READ ONLY
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    // Inner class
    public static class Builder {
        private String name =  "";
        private int speed = 0;
        private boolean flyable = true;

        // WRITE ONLY -> in inner class
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build () {
            return new Animal(this);
        }
    }
}
