import java.util.Arrays;

// reference to instance methods
@FunctionalInterface
interface IMyStringFunc2<T, R>{
    R stringFun(T t);
}

public class MethodRefDemo2 {

    public static void main(String[] args){

        SortClass2 sc = new SortClass2();

        String[] strNames = new String[]{"Ram", "shyam", "Ramesh", "John", "brad",
                "Suresh"};

        IMyStringFunc2<String[], String[]> refObjc = sc::sortNames;
        String[] sortedNames = refObjc.stringFun(strNames);

        for(String name: sortedNames){
            System.out.println(name);
        }

    }


}

class SortClass2{
    String[] sortNames(String[] names){
        Arrays.sort(names);
        return names;
    }
}