package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DecryptReverseOrder {
    public static void main(String[] args) {
        try {
            reverseOrder();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void reverseOrder() throws IOException {
        Path readPath = Paths.get("src/com/company/reversed-order.txt");
        Path writePath = Paths.get("src/com/company/reversed-order2.txt");
        ArrayList<String> content = new ArrayList<>(Files.readAllLines(readPath));
        ArrayList<String> reversedContent = new ArrayList<>();
        String temp = null;
        for (int i = content.size() - 1; i > 0; i--) {
            reversedContent.add(content.get(i));
        }
        Files.write(writePath, reversedContent);
    }
}
