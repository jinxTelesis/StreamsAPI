import java.util.ArrayList;

import java.util.List;


@FunctionalInterface
interface IMyInterface2{
    Person getRef(String firstName, String lastName, int age, char gender);
}


public class LambdaExpressionDemo2 {

    List<Person> personList = createList();





    private static List<Person> createList(){
        List<Person> tempList = new ArrayList<Person>();
        IMyInterface2 createObj = Person::new;
        Person person = createObj.getRef("Ram","Tiwari", 50, 'M');
        tempList.add(person);
        person = createObj.getRef("Prem", "Chopra", 13, 'M');
        tempList.add(person);
        person = createObj.getRef("Tanuja", "Trivedi", 30, 'F');
        tempList.add(person);
        person = createObj.getRef("Manoj", "Sharma", 40, 'M');
        tempList.add(person);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }

}
