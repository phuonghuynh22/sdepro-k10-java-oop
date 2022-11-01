package lab_1213;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public List<FlyAble> flyAbleAnimals (List<FlyAble> flyAbleList) {
        List<FlyAble> flyAbleAnimals = new ArrayList<>();
        for (FlyAble animal : flyAbleList) {
            if (!animal.flyAble()) {
                flyAbleAnimals.add(animal);
            }
        }
        return flyAbleAnimals;
    }

    public void getWinner (List<MoveAble> animals) {

        int winnerSpeed = 0;
        int animalSpeed = 0;
        String animalName = "";
        String winnerName = "";

        for (int i = 0; i < animals.size(); i++) {
            animalSpeed = animals.get(i).speed();
            animalName = animals.get(i).name();
            if (animalSpeed > winnerSpeed) {
                winnerSpeed = animalSpeed;
                winnerName = animalName;
            }
        }
        System.out.print("The winner is " + winnerName + " has the speed " + winnerSpeed + " km/h!");
    }
}
