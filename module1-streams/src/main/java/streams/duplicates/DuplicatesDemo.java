package streams.duplicates;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 7);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = list.stream()
                .filter(num -> !set.add(num))
                .toList();
        System.out.println(duplicates);

        System.out.println(list.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(val -> val.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())
        );

        System.out.println(list.stream()
                .filter(val -> Collections.frequency(list, val) > 1)
                .collect(Collectors.toSet()));
    }
}
