import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(5, 6, 7);
        System.out.println("Sum = " + "");

        List<Integer> li2 = Arrays.asList(5,6,7);
        printElements(li);

        List<Double> ld = Arrays.asList(1.2,3.8,8.2);
        printElements(ld);


    }

    // upperbounds wildcard so all the numerics will wokr
    public static double sumOfElements(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
            return s;
        }
        return s;

    }

    // lower bound init
    // want to write a method that put elements of type Integer into a list
    // make sure method works for List<integer>, List<Number>, and List<Object>
    // anything that can hold integer values

    // you can invoke this method using the following code
    // using object
    // List<Object> lo = new ArrayList<Object>();

    // using Integer
    //List<Integer> li = new ArrayList<Integer>();


    public static void addNumbers(List<? super Integer> list){
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
    }


    // Java unbounded wildcard example

    // Suppose you want to write a method that can print elements of a List of any type.
    // if you write that method using Object as type for the List, you will get an error when you pass it
    // a List of integers
    public static void printElements(List<?> list){
        for(Object elem: list){
            System.out.println(elem + " ");
        }
        System.out.println();
    }


}
