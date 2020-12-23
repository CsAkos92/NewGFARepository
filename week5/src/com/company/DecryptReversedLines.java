package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DecryptReversedLines {
    public static void main(String[] args) {
        try {
            reverseLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reverseLines() throws IOException {
        Path readPath = Paths.get("src/com/company/reversed-line.txt");
        Path writePath = Paths.get("src/com/company/reversed-line.txt");
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(readPath));
        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < content.size(); i++) {
            String line = content.get(i);
            lines.add(reverse(line));
        }
        Files.write(writePath, lines);
    }

    public static String reverse(String line) {
        StringBuilder text = new StringBuilder(line);
        return text.reverse().toString();
    }

}
