package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {


    public static final String SEPARATOR = ",";
    public static final int NAME_INDEX = 0;
    public static final int DATE_INDEX = 2;
    public static final int HOURS_INDEX = 1;

    public String minWork(String filePath) {
        String text = "";
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
                text = parseLinesAndFindMin(reader);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!");
        }
        return text;
    }

    private String parseLinesAndFindMin(BufferedReader reader) throws IOException {
        String text = "";
        int minHours = Integer.MAX_VALUE;
        String line;
        while ((line = reader.readLine())  != null) {
            String[] parts = line.split(SEPARATOR);
            int hours = Integer.parseInt(parts[HOURS_INDEX]);
            if (hours < minHours) {
                minHours = hours;
                text = String.format("%s: %s", parts[NAME_INDEX], parts[DATE_INDEX]);
            }
        }
        return text;

    }
}
