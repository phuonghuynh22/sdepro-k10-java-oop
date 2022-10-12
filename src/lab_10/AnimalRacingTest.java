package lab_10;
import lab_10.Animal.Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacingTest {
    public static void main(String[] args) {

        AnimalController controller = new AnimalController();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(controller.addAnimal("eagle", 100, true));
        animalList.add(controller.addAnimal("tiger", 70, false));
        animalList.add(controller.addAnimal("dog", 40, false));
        animalList.add(controller.addAnimal("falcon", 80, true));
        animalList.add(controller.addAnimal("snake", 120, false));

        List<Animal> raceAbleList = controller.getRaceAbleAnimal(animalList);
        controller.getWinner(raceAbleList);
    }
}
