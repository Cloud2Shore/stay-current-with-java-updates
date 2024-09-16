package streams.nonrepeated;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
//        """
//        Problem Statement: First Non-Repeated Character
//        Find the first non-repeated character in a string.
//
//        Input: "swiss"
//        Expected Output: 'w'
//        """
        String input = "swiss";
        Character firstNonRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(firstNonRepeated);
    }
}
