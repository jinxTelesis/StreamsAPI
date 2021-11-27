import java.util.Arrays;

@FunctionalInterface
interface IMyStringFunc<T, R>{
    R stringFunc(T t);
}


public class MethodRefDemo {

    public static void main(String[] args){
        String[] strNames = new String[]{"Ram", "shyam", "Ramesh", "John", "brad",
                "Suresh"};

        // method reference to the static method sortName
        IMyStringFunc<String[],String[]> stringFunc = SortClass::sortName;

        String[] sortedNames = stringFunc.stringFunc(strNames);
        for(String name: sortedNames){
            System.out.println(name);
        }
    }

}

class SortClass{
    static String[] sortName(String[] names){
        Arrays.sort(names);
        return names;
    }
}
