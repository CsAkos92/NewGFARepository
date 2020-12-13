package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;

public class CountLines {
    public static void main(String[] args) {
        countLines("src/com/company/my-file.txt");


    }

    public static void countLines(String path) {
        ArrayList<String> content = null;
        int counter = 0;
        try {
            content = (ArrayList<String>) Files.readAllLines(Path.of(path));
        } catch (NoSuchFileException e) {
            System.out.println(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : content
        ) {
            counter++;
        }
        System.out.println("A fájlban található sorok száma: " + counter);

    }
}

