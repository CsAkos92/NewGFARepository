package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    // Írj egy függvényt, ami átmásolja egy fájl tartalmát egy másikba
    // A két fájl nevét paraméterként kapja meg
    // És visszaad egy boolean értéket, attól függően,
    // hogy sikeres volt-e a másolás

    public static void main(String[] args) {
        try {
            copyFile("src/com/company/my-file.txt", "src/com/company/my-file2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean copyFile(String input1, String input2) throws IOException {
        Path path1 = Paths.get(input1);
        Path path2 = Paths.get(input2);
        ArrayList<String> content = (ArrayList<String>) Files.readAllLines(path1);
        Files.write(path2, content);
        boolean equals = Files.readAllLines(path1).equals(Files.readAllLines(path2));
        
        return equals;
    }

}
