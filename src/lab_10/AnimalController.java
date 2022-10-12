package lab_10;

import lab_10.Animal.Builder;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public List<Animal> getRaceAbleAnimal (List<Animal> animalList) {

        List<Animal> raceAbleAnimal = new ArrayList<>();

        for (Animal animal : animalList) {
            if (animal.isFlyable() ==  false)
                raceAbleAnimal.add(animal);
        }
        System.out.println(raceAbleAnimal);
        return raceAbleAnimal;
    }

    public void getWinner(List<Animal> animalList) {
        String winnerName = "";
        int winnerSpeed = 0;

        for (Animal animal : animalList) {
            if (animal.getSpeed() >=  winnerSpeed){
                winnerName = animal.getName();
                winnerSpeed = animal.getSpeed();
            }
        }
        System.out.print("The winner is " + winnerName);
        System.out.print(" - with the speed " + winnerSpeed + " km/h!");
    }

    public Animal addAnimal (String name, int maxSpeed, boolean flyable){
        Builder builder  =  new Builder();
        builder
                .setName(name)
                .setSpeed(maxSpeed)
                .setFlyable(flyable);
        Animal animal = builder.build();
        System.out.println(animal);
        return animal;
    }
}
