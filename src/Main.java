// Anagram Solver

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(lines);
            for (String word : lines) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                String signature = new String(letters);
                if (map.containsKey(signature)) {
                    List<String> list = map.get(signature);
                    list.add(word);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(word);
                    map.put(signature, list);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/output.txt"))) {
            for (List<String> group : map.values()) {
                String line = String.join(" ", group);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}