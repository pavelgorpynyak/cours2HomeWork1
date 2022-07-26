public class Person2 {

        public String name;
        public String surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String toString() {
        return "Name " + this.name + " Surname " + this.surname;
    }
    public static void changePerson(Person2 person2) {
        person2 = new Person2("Iliya", "Lagutenko");
        System.out.println(person2);
    }


}
