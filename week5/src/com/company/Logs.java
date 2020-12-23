package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Olvasd ki az összes adatot a 'log.txt' fájlból.
// Minden sor egy üzenetet jelöl egy webszervertől
// Írj egy föggvényt, ami visszaad egy tömböt az egyedi IP címekkel
// Írj egy függvényt, ami visszaadja a GET / POST kérések arányát

public class Logs {
    public static void main(String[] args) {
        try {
            readLogs();
            getPostProportion();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readLogs() throws IOException {
        Path readPath = Paths.get("src/com/company/lox.txt");
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(readPath));
        HashMap<String, Integer> adressIP = new HashMap<>();

        for (String line : content
        ) {
            String[] temp = line.split(" ");
            adressIP.put(temp[8], 0);
        }
        return new ArrayList<>(adressIP.keySet());
    }

    public static double getPostProportion() throws IOException {
        Path readPath = Paths.get("src/com/company/lox.txt");
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(readPath));
        int numberOfGet = 0;
        for (String line : content
        ) {
            String[] temp = line.split(" ");
            if (temp[11].contains("GET")) {
                numberOfGet += 1;
            }
        }
        double prop = (double) numberOfGet / (content.size() - numberOfGet);
        return prop;
    }
}


