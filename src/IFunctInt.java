@FunctionalInterface
public interface IFunctInt {
    int func(int num1, int num2);

    default int getValue(){
        return 0;
    }

    public String toString();
    public boolean equals(Object o);
}
