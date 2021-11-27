import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface IMyFunc2{
    boolean test(int num);
}

public class LambdaDemo4 {

    public static List<Integer> filter(IMyFunc2 testnum, List<Integer> listItems){
        List<Integer> result = new ArrayList<Integer>();

        for(Integer item: listItems){
            if(testnum.test(item)){
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(4);
        myList.add(6);
        myList.add(7);

        Collection<Integer> values = filter(n -> n > 5, myList);
    }
}
