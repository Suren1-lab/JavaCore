package HomeWork9;

import java.io.IOException;
import java.util.Map;


public class FileAnalyzerMain {
    public static void main(String[] args) {

        FileAnalyzer analyzer = new FileAnalyzer();

        // Փոխիր այս PATH-ը քո համակարգին համապատասխան
        String path = " C:/Users/user/Desktop/test.txt";

        try {
            System.out.println("Total words: " + analyzer.totalWordCount(path));
            System.out.println("Unique words: " + analyzer.uniqueWordCount(path));

            System.out.println("\n=== WORD MAP ===");
            Map<String, Integer> wordMap = analyzer.wordMap(path);
            wordMap.forEach((k, v) -> System.out.println(k + " = " + v));

            System.out.println("\nTop 5 frequent words:");
            Map<String, Integer> top = analyzer.topFrequentWords(path, 5);
            top.forEach((k, v) -> System.out.println(k + " = " + v));

            System.out.println("\nOccurrences of 'java': "
                    + analyzer.countWordOccurrences(path, "java"));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
