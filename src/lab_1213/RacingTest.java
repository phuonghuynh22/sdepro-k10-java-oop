package lab_1213;

import java.util.Arrays;
import java.util.List;

public class RacingTest {
    public static void main(String[] args) {

        RacingController racingController =  new RacingController();
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Horse horse = new Horse();
        List eligibleRacers = racingController.flyAbleAnimals(Arrays.asList(dog, eagle, horse));
        System.out.println(eligibleRacers);
        racingController.getWinner(eligibleRacers);
    }
}
