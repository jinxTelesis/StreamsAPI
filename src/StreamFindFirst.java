import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {


    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,9,1,9,7,9);

        Optional<Integer> firstNumFromStream = list.stream().findFirst();

        if(firstNumFromStream.isPresent()){
            System.out.println("First Element in the stream- " + firstNumFromStream);
        } else {
            System.out.println("No element found");

        }

        // find first used on resultant stream
        List<Integer> list2 = Arrays.asList(3,9,1,9,7);

        Optional<Integer> firstNumFromStream2 = list.stream()
                .filter(e -> e > 3)
                .findFirst();

        if(firstNumFromStream2.isPresent()){
            System.out.println("");
        } else
        {
            System.out.println();
        }

        List<String> nameList = Arrays.asList("Andy", "Mona", "Vikram", "Jenny", "Meena");
        Optional<String> firstName = nameList.stream()
                .filter( e-> e.startsWith("M"))
                .findFirst();
        if(firstName.isPresent()){
            System.out.println("");
        } else {
            System.out.println("");
        }

    }

}
