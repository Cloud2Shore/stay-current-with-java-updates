package streams.filtercount;

import java.util.Arrays;
import java.util.List;

public class VowelsExample {
    public static void main(String[] args) {
//        """
//        Problem Statement: Filter and Count Words
//        Given a list of strings, filter the strings that start with a vowel and count them.
//
//        Input: List<String> words = Arrays.asList("apple", "banana", "orange", "umbrella", "kiwi", "elephant");
//        Expected Output: 4
//        """
        List<String> words = Arrays.asList("apple", "banana", "orange", "umbrella", "kiwi", "elephant");
        System.out.println((long) words.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("e") || name.startsWith("i")
                        || name.startsWith("o") || name.startsWith("u"))
                .toList().size());
    }
}
