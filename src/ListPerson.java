import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListPerson {

    public void listDrivers(List<Person> personList, Predicate<Person> pred){
        List<Person> driverList = new ArrayList<Person>();

        for(Person person: personList){
            if(pred.test(person)){
                driverList.add(person);
            }
        }

        System.out.println("List of drivers ");
        printList(driverList);
    }

    public void listVoters(List<Person> personList, Predicate<Person> pred){
        List<Person> voterList = new ArrayList<Person>();

        for(Person person: personList){
            if(pred.test(person)){
                voterList.add(person);
            }
        }
        System.out.println("List of voters");
        printList(voterList);
    }

    public void listSeniorCitizens(List<Person> personList, Predicate<Person> pred){
        List<Person> seniorCitizenList = new ArrayList<Person>();
        for(Person person: personList){
            if(pred.test(person)){
                seniorCitizenList.add(person);
            }
        }
    }

    private void printList(List<Person> personList){
        personList.forEach((p) -> System.out.println(" FirstName - " + p.getFirstName()
         + " LastName -" + p.getLastName() + " Age - " + p.getAge()));
    }

}
