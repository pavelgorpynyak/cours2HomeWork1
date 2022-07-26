import java.util.Arrays;

public class Methods {


    // lesson 5

    public static int changeValue(int value) {
        value = 22;
        System.out.println("Value " + value);
        return value;
    }

    // Lesson 6

    public static Integer changeValue2(Integer value2) {
        value2 = 22;
        System.out.println("Value " + value2);
        return value2;
    }

    // Lesson 7

    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value3));
    }

    // Lesson 8

    public static void changeValue4(Integer[] value4) {
        value4[0] = 99;
        System.out.println("value4[0] " + value4);
    }

    // Lesson 9


}
