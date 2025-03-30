package cursurPractice2.incapsularea;

public class Application {
    public static void main (String[] args) {
        AdultPerson person = new AdultPerson();
        person.setName("John");
        person.setAge(25);
        person.setIdnp(2025045654);
        System.out.println(person.getName());


    }
}
