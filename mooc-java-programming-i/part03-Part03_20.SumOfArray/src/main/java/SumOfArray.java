
public class SumOfArray {

    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        int sum = sumOfNumbersInArray(numbers);
        System.out.println(sum);
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
