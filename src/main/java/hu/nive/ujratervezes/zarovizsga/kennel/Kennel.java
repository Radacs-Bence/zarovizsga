package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> Dogs = new ArrayList<>();


    public void addDog(Dog dog) {
        Dogs.add(dog);
    }

    public void feedAll() {
        for (Dog dog : Dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        Dog found = null;
        for (Dog dog : Dogs) {
            if (dog.getName().equals(name)){
                found = dog;
            }
        }
        if (found == null){
            throw new IllegalArgumentException("Dog not found!");
        }
        return found;
    }

    public void playWith(String name, int hours) {
        Dog playMate = findByName(name);
        playMate.play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogNames = new ArrayList<>();
        for (Dog dog : Dogs) {
            if (dog.getHappiness() >= minHappiness){
                happyDogNames.add(dog.getName());
            }
        }
        return happyDogNames;
    }

    public List<Dog> getDogs() {
        return new ArrayList<>(Dogs);
    }
}
