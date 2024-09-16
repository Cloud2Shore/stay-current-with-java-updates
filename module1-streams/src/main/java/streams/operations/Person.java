package streams.operations;

public record Person(String name, Gender gender) {
    enum Gender {MALE, FEMALE, OTHER}
}
