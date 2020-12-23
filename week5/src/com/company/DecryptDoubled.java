package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DecryptDoubled {
    public static void main(String[] args) {
        try {
            doubled();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void doubled() throws IOException {
        Path path = Paths.get("src/com/company/duplicated-chars.txt");
        Path path2 = Paths.get("src/com/company/duplicated-chars2.txt");

        ArrayList<String> content = new ArrayList<>(Files.readAllLines(path));

        for (int i = 0; i < content.size(); i++) {
            String line = content.get(i);
            line = removeDouble(line);
            content.set(i, line);
        }
        Files.write(path2, content);

    }

    public static String removeDouble(String text) {
        StringBuilder text2 = new StringBuilder();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                text2.append(text.charAt(i));
                i++;
            }
        }
        return text2.toString();
    }


}
