import java.util.Optional;

public class CovariantDemo {

    public static void main(String[] args){
        C c;
        c = new C();
        System.out.println("Value from class C "+ c.getValue().name);

        c = new D();
        System.out.println("Value from class D" + c.getValue().name);

        // return type is a subclass of type
        // covariant is a subclass of return of parent class
    }

    // Abstract class can have constructors
    // Abstract class can have instance variables

    // String regular
    // String? nullable

    // String.? safe call
    // String.!! programmer override NPE Chance

    Optional<String> op = Optional.empty();

    Optional<String> op2 = Optional.of("Hello");

    //Ward ward = new Ward();
    //String id = patient != null ? patient.getId() : "9999";

    //Optional<String> op1 = Optional.ofNullable(patient.getId());

    //String id = op1.orElse("9999")

    //orElse method
    //orElseThrow()

    //op1.ifPresent(v->numList.add(v));





}
