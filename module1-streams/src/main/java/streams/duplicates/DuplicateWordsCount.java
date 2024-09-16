package streams.duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordsCount {
    public static void main(String[] args) {
//        """
//        Problem Statement: Duplicate Words Count
//        Count the occurrences of each word in a list, ignoring case.
//
//        Input: List<String> words = Arrays.asList("Java", "python", "java", "Python", "C++");
//        Expected Output: {java=2, python=2, c++=1}
//        """
        List<String> words = Arrays.asList("Java", "python", "java", "Python", "C++");
        Map<String, Long> wordCount = words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCount);
    }
}