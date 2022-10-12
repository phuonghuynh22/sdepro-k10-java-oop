package lesson_10;

//Outer class
public class HouseWithBuilder {

    private String color = "White";
    private int mainDoor = 1;
    private int windows = 4;
    private String topRootColor = "Red";

    // disable the default constructor by setting it to protected
    // so that non-child (no relationship) cannot call this
    private HouseWithBuilder (Builder builder){
        this.color = builder.color;
        this.mainDoor = builder.mainDoor;
        this.windows = builder.windows;
        this.topRootColor = builder.topRootColor;
    }

    // READ ONLY ->  Outer
    public String getColor() {
        return color;
    }

    public int getMainDoor() {
        return mainDoor;
    }

    public int getWindows() {
        return windows;
    }

    public String getTopRootColor() {
        return topRootColor;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", windows=" + windows +
                ", topRootColor='" + topRootColor + '\'' +
                '}';
    }

    // Inner class - CustomerService
    public static class Builder {

        private String color = "White";
        private int mainDoor = 1;
        private int windows = 4;
        private String topRootColor = "Red";

        // WRITE ONLY -> in inner class -> print out once
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoor(int mainDoor) {
            this.mainDoor = mainDoor;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setTopRootColor(String topRootColor) {
            this.topRootColor = topRootColor;
            return this;
        }


        public HouseWithBuilder build () {
            return new HouseWithBuilder(this);
        }
    }
}
