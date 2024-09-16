package streams.oddeven;

import java.util.Arrays;
import java.util.List;

public class OddEvenExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        final List<Integer> list1 = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println(list1);
    }
}
