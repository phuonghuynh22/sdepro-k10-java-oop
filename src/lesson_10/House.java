package lesson_10;

public class House {

    private String color = "White";
    private int mainDoor = 1;
    private int windows = 4;
    private String topRootColor = "Red";

    //context: Object has many attributes. Sometimes not used, sometimes used with new value (not default one)

    /* 1/
     * If using constructors, then it needs constructor for each of attributes => so many constructors
     */

    // 2/ If using one constructor having all attributes:
    // many variables which makes confusing
    // this is not recommended
    // Therefore. the solution is generating setter for all attributes (3)
    /*
    public House(String color, int mainDoor, int windows, String topRootColor) {
        if (color != null)
            this.color = color;
        if (mainDoor > 0 && mainDoor != 1)
            this.mainDoor = mainDoor;
        if (mainDoor > 0 && mainDoor != 4)
            this.windows = windows;
        if (topRootColor != null)
            this.topRootColor = topRootColor;
    }

     */

    // =>>> the solution is: generating setter for all attributes
    // 3/
    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoor(int mainDoor) {
        this.mainDoor = mainDoor;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTopRootColor(String topRootColor) {
        this.topRootColor = topRootColor;
    }


    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", windows=" + windows +
                ", topRootColor='" + topRootColor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house = new House();
        house.setColor("Pink");
        System.out.println(house); // without the toString() above, the result print out will be: "lesson_10.House@29453f44"
    }
}
