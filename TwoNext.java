import java.util.*;

// using Hashmap
class TwoNext {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (Numbers.containsKey(result)) {
                return new int[] { i, Numbers.get(result) };
            }
            Numbers.put(nums[i], i);// Putting the key and the index into the HashMap
        }
        throw new IllegalArgumentException("no match");

    }
}
