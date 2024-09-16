package lambda.simple;

interface PaymentMethod {
    void netBanking(Float amount);

    default void phonePe(Float amount) {
        System.out.println("Paid " + amount + " by phonePe");
    }
}

public class LambdaFirstExample {
    public static void main(String[] args) {
        //Anonymous class Style
        PaymentMethod paymentMethod = new PaymentMethod() {
            @Override
            public void netBanking(Float amount) {
                System.out.println("Paid " + amount + " by Net Banking");
            }
        };
        paymentMethod.netBanking(100f);

        //Lambda Style
        PaymentMethod paymentMethod1 = amount -> System.out.println("Paid " + amount + " by Net Banking");
        paymentMethod1.netBanking(100f);
    }
}
