package lambda.coding;

@FunctionalInterface
interface A{
    void method();
}

@FunctionalInterface
interface B extends A{
    void method();
}

@FunctionalInterface
interface C extends A{
//    Compile Time Error
//    void method1();
}
public class InterfaceExample {
    public static void main(String[] args) {

    }
}
