package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{


    public static final int FEEDING_HAPPINESS = 2;
    public static final int PLAYING_HAPPINESS_MODIFIER = 2;

    public Beagle(String name) {
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
