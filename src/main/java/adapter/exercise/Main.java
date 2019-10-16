package adapter.exercise;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("/Users/miyamotonanako/Lessons/designPattern/src/main/java/adapter/exercise/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("/Users/miyamotonanako/Lessons/designPattern/src/main/java/adapter/exercise/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}