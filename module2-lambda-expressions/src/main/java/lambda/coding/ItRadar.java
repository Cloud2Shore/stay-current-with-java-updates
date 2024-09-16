package lambda.coding;

interface ItCompany
{
    void acquision();
    default void spinOff(){
        System.out.println(" SpinOff");
    }
}
public class ItRadar
{
    ItCompany itCompany = new ItCompany() {
        @Override
        public void acquision() {

        }
    };
}
