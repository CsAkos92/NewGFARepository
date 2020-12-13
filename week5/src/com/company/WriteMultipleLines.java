package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeLines("src\\com\\company\\my-file.txt", "apple", 555);


    }

    public static void writeLines(String pathInput, String world, int number) {
        Path path = Paths.get(pathInput);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            list.add(world);
        }
        System.out.println(list);
        try {
            Files.write(path, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
