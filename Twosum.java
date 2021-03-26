import java.util.*;

class Twosum {

    public static void main(String[] args) {
        int[] nums = new int[] { 3, 5, 6, 2, 4 };
        int target = 7;
        int[] result = getTwoSum(nums, target);
        System.out.println(result);
    }

    public static int[] getTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int com = target - nums[i];
                if (nums[j] == com) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no match");
    }

}
