package streams.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLengthExample {
    public static void main(String[] args) {
//        """
//        Problem Statement: Group by Length
//        Group a list of strings by their length.
//
//        Input: List<String> words = Arrays.asList("apple", "banana", "pear", "fig", "kiwi");
//        Expected Output: {3=[fig], 4=[pear, kiwi], 5=[apple], 6=[banana]}
//        """
        List<String> words = Arrays.asList("apple", "banana", "pear", "fig", "kiwi");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
}
