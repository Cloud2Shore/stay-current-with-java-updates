package streams.sumofsquares;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfSquaresDemo {
    public static void main(String[] args) {
//        """
//        Problem Statement: Sum of Squares
//        Calculate the sum of the squares of all even numbers from a list of integers.
//        Input: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Expected Output: 56 (2^2 + 4^2 + 6^2)
//        """;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .reduce(Integer::sum);
        System.out.println(sum.orElse(0));
    }
}
