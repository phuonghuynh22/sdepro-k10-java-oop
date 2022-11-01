package lesson_12_has_a_relationship;

import java.util.List;

public class SwimContest {

    void printWinner (ISwimAble swimAble){
        System.out.println(swimAble.IsSwimAble());
    }

    void printWinner_ (IFlyAble flyAble){
        System.out.println(flyAble.isFlyAble());
    }

    void getWinner (List<Animal> animalList){
        for (Animal animal : animalList) {
            animal.getSpeed();
        }
    }

    public static void main(String[] args) {
        new SwimContest().printWinner(new Duck());
        //new SwimContest().printWinner(new Tiger()); // -> this is incorrect as Tiger object does not have declaration "implements ISwimAble"
    }
}
