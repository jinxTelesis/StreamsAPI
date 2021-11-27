import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface XFuncInterface{
    boolean testMethod(int num);
}

interface YFuncInterface{
    boolean testMethod1000(String str);
}

public class LambdaDemo5 {

    public static List<Integer> dontFilter(XFuncInterface x, List<Integer> listItems){
        List<Integer> result = new ArrayList<Integer>();
        for(Integer item: listItems){
            if(x.testMethod(item)){
                result.add(item);
            }
        }
        return result;
    }

    public static List<String> stuffWithThings(YFuncInterface y, List<String> strStuff){
        List<String> result = new ArrayList<String>();
        for(String strX: strStuff){
            if(y.testMethod1000(strX));
            {
                result.add(strX);
            }
        }
        return result;
    }


    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(4);
        myList.add(6);
        myList.add(7);

        Collection<Integer> values = dontFilter(n -> n >5, myList);

        List<String> strList2 = new ArrayList<String>();
        strList2.add("Time");
        strList2.add("Choco");

        Collection<String> valuesStr = stuffWithThings(n -> n.equals("time"), strList2);


    }

}
