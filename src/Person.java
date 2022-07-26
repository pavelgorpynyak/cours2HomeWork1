public class Person {

    public String name;
    public String surname;

    public Person() {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Name " + this.name + " Surname " + this.surname;
    }

    public static void changePerson(Person person) {
        person.name = "Iliya";
        person.surname = "Lagutenko";
        System.out.println(person);
    }
}
