interface IMyInterface{
    int getValue();
}

interface StrMyInterface{
    String getValue();
}

interface IBMyInterface{
    boolean test(int n);
}

public class LambdaExpressionDemo {

    public static void main(String... ar){
        IMyInterface odjRef;

        odjRef = () -> 7;
        System.out.println("value is " + odjRef.getValue());

        odjRef = () -> 7 * 5;
        System.out.println("Value is " + odjRef.getValue());

        //odjRef = () -> "11";

        StrMyInterface strRef;

        strRef = () -> "11";

        strRef = () -> "7" + "11";


        IBMyInterface IBjRef;

        IBjRef = n -> (n %2) == 0;

        System.out.println("4 is even " + IBjRef.test(4));
        System.out.println("3 is even " + IBjRef.test(3));


    }

}
