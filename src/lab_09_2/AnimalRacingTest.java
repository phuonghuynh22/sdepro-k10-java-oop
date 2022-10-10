package lab_09_2;

import java.util.Arrays;
import java.util.List;

public class AnimalRacingTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        dog.setName("lulu");
        horse.setName("mama");
        tiger.setName("hoho");

        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        AnimalController controller = new AnimalController();
        System.out.println(controller.getWinner(animalList));
    }
}
