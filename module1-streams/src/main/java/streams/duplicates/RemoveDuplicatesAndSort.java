package streams.duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
//        """
//        Problem Statement: Remove Duplicates and Sort
//        Remove duplicates from a list of strings and sort them in reverse alphabetical order.
//
//        Input: List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
//        Expected Output: ["cherry", "banana", "apple"]
//        """
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        List<String> result = words.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
