package lab_11;

import java.util.List;

public class AnimalController {

    public void getWinner(List<Animal> animalList) {
        String winnerName = "";
        String animalName = "";
        int winnerSpeed = 0;
        int aninalSpeed = 0;

        for (int i = 0; i < animalList.size(); i++) {
            aninalSpeed = animalList.get(i).getRandomSpeed();
            animalName = animalList.get(i).getName();
            System.out.println(animalName + " - speed " + aninalSpeed + " km/h");
            if (aninalSpeed > winnerSpeed) {
                winnerSpeed = aninalSpeed;
                winnerName = animalName;
            }
        }
        System.out.print("The winner is " + winnerName  + " - with the speed " + winnerSpeed + " km/h!");
    }
}
