import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void main(String[] args){
        Consumer<String> consumer = s -> System.out.println(s + "!");
        List<String> alphaList = Arrays.asList("A","C");

        for(String str: alphaList){
            consumer.accept(str);
        }


        Supplier<LocalDateTime> currDateTime = () -> LocalDateTime.now();

        System.out.println(currDateTime.get());


        Function<String, Integer> function = (s) -> s.length();
        System.out.println("Length of String- " + function.apply("Interface") );


        Predicate<Integer> predicate = (n) -> n%2 == 0;
        boolean val = predicate.test(6);

        

    }

}
