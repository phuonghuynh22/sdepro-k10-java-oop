package lab_11;

import java.util.Arrays;
import java.util.List;

public class AnimalRacingTest {

    public static void main(String[] args) {
        Animal dog = new Dog();dog.setName("lulu");
        Animal horse = new Horse(); horse.setName("mama");
        Animal tiger = new Tiger();tiger.setName("hoho");

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        AnimalController controller = new AnimalController();
        controller.getWinner(animalList);
    }
}
