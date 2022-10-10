package lesson_09;

import lesson_08.RobotCat;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObjects {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();
        RobotCat meomeo = new RobotCat();
        meomeo.setName("meomeo");
        System.out.println(meomeo);

        System.out.println(meomeo.getClass().getName());
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

        //object was created as a reference type
        robotCatList.get(robotCatList.size() - 1).setName("doremi");

        System.out.println(robotCatList);
    }
}
