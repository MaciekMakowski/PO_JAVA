package pl.maciejmakowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordInTreeSet {
    public static void main(String[] args) throws FileNotFoundException {

        Set<String> words = new TreeSet<>();
        long totalTime = 0;
        String path = "src/pl/maciejmakowski/alice30.txt";
        Scanner in = new Scanner(new File(path));
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}