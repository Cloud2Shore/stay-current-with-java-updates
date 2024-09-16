package lambda.simple;

import java.util.Objects;

@FunctionalInterface
interface WashingMachine {
    void wash(int weight);

    default WashingMachine andThen(WashingMachine after) {
        Objects.requireNonNull(after);
        return (int t) -> {
            wash(t);
            after.wash(t);
        };
    }
}

public class WashingMachineExample {
    public static void main(String[] args) {
        WashingMachine washingMachine = weight -> System.out.println("Washing " + weight + " Kg");

        // Creating a new WashingMachine with the andThen chaining
        WashingMachine combinedWashingMachine = washingMachine.andThen(weight -> System.out.println("Washed " + weight + " Kg"));

        // Using the combined WashingMachine
        combinedWashingMachine.wash(1);  // This will print "Washing 1 Kg" and then "Washed 1 Kg"
    }
}

