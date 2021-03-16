package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    public static final int FEEDING_HAPPINESS = 4;
    public static final int PLAYING_HAPPINESS_MODIFIER = 3;

    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        increaseHappiness(FEEDING_HAPPINESS);
    }

    @Override
    public void play(int hours) {
        increaseHappiness(hours * PLAYING_HAPPINESS_MODIFIER);
    }
}
