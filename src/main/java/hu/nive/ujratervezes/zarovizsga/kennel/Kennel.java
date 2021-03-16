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
        return null;
    }

    public void playWith(String name, int hours) {
    }

    public <E> List<E> getHappyDogNames(int minHappiness) {
        return null;
    }

    public List<Dog> getDogs() {
        return new ArrayList<>(Dogs);
    }
}
