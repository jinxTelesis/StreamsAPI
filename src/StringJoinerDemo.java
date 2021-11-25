import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String... arg){
        String str1 = "An";
        String str2 = "example";
        String str3 = "string";

        StringJoiner sj = new StringJoiner(":");
        sj.add(str1).add(str2).add(str3);


    }

}
