package lesson_10;

import java.util.ArrayList;
import java.util.List;

import static lesson_10.HouseWithBuilder.Builder;

public class TestHouseWithBuilder {
    public static void main(String[] args) {


        //HouseWithBuilder.Builder = new HouseWithBuilder();


/*
        // the import above helps reduce calling class
        // design pattern
        Builder builder = new Builder();
        builder.setColor("Pink");
        builder.setMainDoor(10);
        builder.setWindows(50);
        builder.setTopRootColor("grey");
        HouseWithBuilder house = builder.build();
        System.out.println(house.toString());
*/


        //method chaining
        // calling a chain of attribute without calling the object
        // to use this: returning typee of setters in inner class should be returned as an object - its object is "builder" (the returning type default is "void")
        Builder builder = new Builder();
        builder
                .setColor("Pink")
                .setMainDoor(10)
                .setWindows(50)
                .setTopRootColor("grey");

        HouseWithBuilder house = builder.build();
        System.out.println(house);

        List<HouseWithBuilder> houseList = new ArrayList<>();
        houseList.add(house);


    }
}
