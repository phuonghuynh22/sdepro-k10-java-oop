package lab_11;

public abstract class Animal {

    private String name;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract int getRandomSpeed();
}
