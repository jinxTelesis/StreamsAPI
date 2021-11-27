interface IFunctInt2{
    int func(int num1, int num2) throws Exception;
}

public class LambdaExceptionDemo {

    public static void main(String[] args){
        IFunctInt2 funcInt = (num1, num2) -> {
            int result = num1 +  num2;
            throw new Exception();
        };
    }

    // method reference is similar to lambda expression


}
