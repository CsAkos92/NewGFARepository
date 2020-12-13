package com.company;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class PrintEachLine {
    public static void main(String[] args) {
        Path path = Paths.get("src/com/company/my-file.txt");
        ArrayList<String> content = new ArrayList<>();
        try {
            content = (ArrayList<String>) Files.readAllLines(path);
        } catch (NoSuchFileException e) {
            System.out.println(path.getFileName() + " does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : content
             ) {
            System.out.println(line);

        }

    }

}


