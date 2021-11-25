import java.util.*;
import java.util.stream.Collectors;

public class Test1Main {

    public static void main(String[] arg){
        List<Employee> empList = new ArrayList<Employee>();
        Employee emp1 = new Employee("E0001",40,"Ram",'m',5000);
        Employee emp2 = new Employee("E0002",50,"sheild",'f',6000);
        Employee emp3 = new Employee("E0003",60,"ted",'m',500000);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(nameList);

        Set<String> nameSet = empList.stream().map(Employee::getName).collect(Collectors.toSet());

        System.out.println(nameSet);

        Set<String> nameSet2 = empList.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));

        Map<String, String> nameMap = empList.stream().collect(Collectors.toMap(Employee::getEmpId,Employee::getName));

        String names = empList.stream().map(Employee::getName).collect(Collectors.joining(","));

        int totalSalary = empList.stream().collect(Collectors.summingInt(Employee::getSalary));

        Map<Character, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getSex));

        Map<Boolean, List<Employee>> empMap2 = empList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >= 8000));





    }
}
