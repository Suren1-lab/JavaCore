package HomeWork9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class FileAnalyzer {

    // կարդում է ամբողջ ֆայլը և վերադարձնում բառերի list
    private List<String> readWords(String path) throws IOException {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.toLowerCase().split("\\W+");
                for (String w : arr) {
                    if (!w.isEmpty()) {
                        words.add(w);
                    }
                }
            }
        }
        return words;
    }


    public Map<String, Integer> wordMap(String path) throws IOException {
        List<String> words = readWords(path);
        Map<String, Integer> result = new HashMap<>();

        for (String w : words) {
            result.put(w, result.getOrDefault(w, 0) + 1);
        }

        return result;
    }


    public int totalWordCount(String path) throws IOException {
        return readWords(path).size();
    }


    public int uniqueWordCount(String path) throws IOException {
        return new HashSet<>(readWords(path)).size();
    }


    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        Map<String, Integer> map = wordMap(path);

        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // descending
                .limit(n)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> x,
                        LinkedHashMap::new
                ));
    }


    public int countWordOccurrences(String path, String word) throws IOException {
        Map<String, Integer> map = wordMap(path);
        word = word.toLowerCase();
        return map.getOrDefault(word, 0);
    }
}


