import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // lesson 5

        System.out.println("Lesson 5");
        int value = 33;
        Methods.changeValue(value);
        System.out.println("Value " + value);

        // Lesson 6

        System.out.println("Lesson 6");
        Integer value2 = 33;
        Methods.changeValue2(value2);
        System.out.println("Value " + value2);

        // Lesson 7

        System.out.println("Lesson 7");
        Integer[] value3 = {3, 4};
        Methods.changeValue3(value3);
        System.out.println(Arrays.toString(value3));

        // Lesson 8

        System.out.println("Lesson 8");
        Integer[] value4 = {3, 4};
        Methods.changeValue4(value4);
        System.out.println(Arrays.toString(value4));

        // Lesson 9

        System.out.println("Lesson 9");
        Person person = new Person();
        person.name = "Lypis";
        person.surname = "Trubetskoy";
        System.out.println(person);
        Person.changePerson(person);
        System.out.println(person);

        // Lesson 10

        System.out.println("Lesson 10");
        Person2 person2 = new Person2("Lypis", "Trubetskoy");
        System.out.println(person2);
        Person2.changePerson(person2);
        System.out.println(person2);
    }
}