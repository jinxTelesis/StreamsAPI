
@FunctionalInterface
public interface E {
    int func(int num1, int num2);

    // default method is okay but not another method
    default int getValue(){
        return 0;
    }

}
