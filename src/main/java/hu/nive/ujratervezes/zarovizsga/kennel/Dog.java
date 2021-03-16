package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    private String name;
    private int happiness = 0;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void increaseHappiness(int amount){
        happiness += amount;
    }

    public abstract void feed();

    public abstract void play(int hours);
}
