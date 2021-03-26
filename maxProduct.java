import java.util.*;

public class maxProduct {

    public static int maximumProduct(int[] numbers) {
        int length1 = numbers.length;
        if (length1 < 2) {
            System.out.println("Not desired value");
        }
        Arrays.sort(numbers);
        int maximumValue = numbers[length1 - 1] * numbers[length1 - 2];
        return maximumValue;
    }

    public static void maximumProduct2(int[] numbers) {

    }

    public static void main(String[] args) {
        int[] nums = { 4, 6, 8, 1, 5 };
        int max = maximumProduct(nums);
        System.out.println(max);
    }
}
