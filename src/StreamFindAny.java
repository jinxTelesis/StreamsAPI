import java.util.*;

public class StreamFindAny {

    public static void main(){

        List<Integer> list = Arrays.asList(3,9,1,9,7,8);

//        Optional<Integer> anyNumFromStream = list.stream().findAny();
//
//        if(anyNumFromStream.isPresent()){
//            System.out.println();
//        }
//
        list.stream()
                .filter(e -> e > 5)
                .findAny()
                .ifPresent(System.out::println);

        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        numList.stream().filter(e -> e > 3).forEach(System.out::println);


        List<Integer> numList2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Iteratin list");

        Set<Integer> numSet = new HashSet<Integer>();
        numSet.add(1);
        numSet.add(2);

        System.out.println("Iterating set");
        numSet.forEach(System.out::println);

        List<Integer> numList3 = Arrays.asList(1,2,3,4,5);

        numList3.stream().filter(e -> e > 3).forEach(System.out::println);

        Set<Integer> numSet2 = new HashSet<Integer>();
        numSet.add(1);
        numSet.add(2);

        numSet.stream().filter(s -> s%2 == 0).forEach(System.out::println);

        // Map doesn't implement Collection interface so you ahve to get a collection view of the map

        Map<String,String> numMap = new HashMap<String, String>();
        numMap.put("1","2");
        numMap.put("2","2");

        //numMap.forEach((k,v) -> System.out.println("Key ") + k);
        numMap.entrySet().stream().forEach(System.out::println);

    }
}
