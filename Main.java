import java.util.*;

public class Main {

    public static Integer findMaximum(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    public static Float findMaximum(Float num1, Float num2, Float num3) {
        Float max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        if (num3.compareTo(max) > 0) {
            max = num3;
        }

        return max;
    }

    public static String findMaximum(String str1, String str2, String str3) {
        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }

        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        return max;
    }

    public static <T extends Comparable<T>> T findMaximum(T... values) {
        List<T> list = Arrays.asList(values);
        Collections.sort(list);

        return list.get(list.size() - 1);
    }

    public static <T> void printMax(T max) {
        System.out.println("Max value is: " + max.toString());
    }

    public static void main(String[] args) {
        // UC 1 test cases
        Integer max1 = findMaximum(10, 5, 2);
        printMax(max1);

        Integer max2 = findMaximum(2, 15, 5);
        printMax(max2);

        Integer max3 = findMaximum(3, 7, 12);
        printMax(max3);

        // UC 2 test cases
        Float max4 = findMaximum(2.5f, 1.3f, 0.9f);
        printMax(max4);

        Float max5 = findMaximum(1.2f, 3.4f, 2.1f);
        printMax(max5);

        Float max6 = findMaximum(0.8f, 1.7f, 2.9f);
        printMax(max6);

        // UC 3 test cases
        String max7 = findMaximum("apple", "peach", "banana");
        printMax(max7);

        String max8 = findMaximum("carrot", "grape", "orange");
        printMax(max8);

        String max9 = findMaximum("elephant", "dog", "zebra");
        printMax(max9);

        // UC 4 test cases
        Integer max10 = findMaximum(1, 4, 6, 3, 8, 2);
        printMax(max10);

        Float max11 = findMaximum(1.2f, 3.4f, 2.1f, 0.9f, 4.5f);
        printMax(max11);

        String max12 = findMaximum("apple", "peach", "banana", "carrot", "grape");
        printMax(max12);
    }
}
