import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

 public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        int[] intArray = {5, 2, 9, 1, 5, 6};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"banana", "apple", "cherry"};
        sort(strArray);
        System.out.println(Arrays.toString(strArray));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        sortIntegers(intList);
        System.out.println(intList);

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("dog", "cat", "bird"));
        sortStrings(strList);
        System.out.println(strList);
    }

}
