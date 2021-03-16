package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {

    private static final String DIGITS = "0;1;2;3;4;5;6;7;8;9";
    public static final String SEPARATOR = ";";

    public int getCountOfDigits(String numbers) {
        int counter = 0;
        if (numbers == null){
            return 0;
        }
        for (String digit : DIGITS.split(SEPARATOR)) {
            if (numbers.contains(digit)){
                counter ++;
            }
        }
        return counter;
    }

}
