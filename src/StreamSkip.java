import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class StreamSkip {

    public static void main(String[] args){

        StreamSkip ss = new StreamSkip();

        List<Integer> numList = Arrays.asList(1,2,3,4,4,5,6,6,7);
        List<Integer> subList = ss.getSubList(numList,4);

        System.out.println("Sublist after skipping elements");

        List<String> strList = Arrays.asList("one","two","three","four","five","six","seven");

        List<String> strSubList = ss.getSubList(strList, 5);


        List<Employee> empList = Arrays.asList(new Employee("E001", 40, "Ram", 'M', 5000),
                new Employee("E002", 35, "Shelly", 'F', 7000),
                new Employee("E003", 24, "Mark", 'M', 9000),
                new Employee("E004", 37, "Rani", 'F', 10000),
                new Employee("E005", 32, "Anuj", 'M', 12000));

        List<String> nameList = empList.stream()
                .filter(e -> (e.getAge() == 60))
                .map(Employee::getName)
                .collect(Collectors.toList());

        List<Employee> namelist = empList.stream()
                .filter(e -> (e.getAge() == 60) && (e.getSalary() > 10000))
                .collect(Collectors.toList());

        for(Employee e : namelist){
            System.out.println("Employee Name: " + e.getName()
            + " Salary: " + e.getSalary());
        }


        List<Integer> numList3 = Arrays.asList(1,6,1,15,4,11,15);

        numList3.stream().distinct().forEach(System.out::println);

        List<String> nameList3 = Arrays.asList("Dan","Preeti","Dan","Preeti","Jean");

        List<String> distinctNameList = nameList3.stream().distinct().collect(Collectors.toList());


        List<Integer> numList4 = Arrays.asList(5,6,7,13);

        Optional<Integer> max = numList.stream().max(Integer::compare);
        if(max.isPresent()){
            System.out.println("Maximun element: " + max.get());
        }

        List<Integer> numlist5 = Arrays.asList(7,9,14,1,59,23,77,10,12,4);

        Optional<Integer> minElement = numlist5.stream().min(Integer::compare);
        if(minElement.isPresent()){
            System.out.println("Minium element: "+ minElement.get());
        }


        List<String> nameList6 = Arrays.asList("Ram","Sheila","Mukesh","Rani","Nick","Amy","Desi","Margo");

        Spliterator<String> splitStr = nameList6.spliterator();
        while(splitStr.tryAdvance((n) -> System.out.println("name - " + n )));





    }

    public <T> List<T> getSubList(List<T> firstList, long n){
        return firstList.stream().skip(n).collect(Collectors.toList());
    }
}

