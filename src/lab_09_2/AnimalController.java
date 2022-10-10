package lab_09_2;

import java.security.SecureRandom;
import java.util.*;

public class AnimalController {

    public String getWinner(List<Animal> animalList) {
        String winnerName = "";
        int winnerSpeed = 0;

        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getRandomSpeed() > winnerSpeed) {
                winnerSpeed = animalList.get(i).getRandomSpeed();
                winnerName = animalList.get(i).getName();
            }
        }
        System.out.println(winnerSpeed);
        return winnerName;
    }

}
