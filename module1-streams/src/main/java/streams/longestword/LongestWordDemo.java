package streams.longestword;

import java.util.Arrays;
import java.util.List;

public class LongestWordDemo {
    public static void main(String[] args) {
//        """
//        Problem Statement: Find Longest Word
//        Find the longest word in a given list of strings using streams.
//
//        Input: List<String> words = Arrays.asList("cat", "butterfly", "elephant", "dog");
//        Expected Output: "butterfly"
//        """
        List<String> words = Arrays.asList("cat", "butterfly", "elephant", "dog");
        String longestWord = words.stream()
                .max((word1, word2) -> word1.length() - word2.length())
                .orElse("");
        System.out.println(longestWord);
    }
}
