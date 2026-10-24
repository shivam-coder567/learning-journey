import java.util.Arrays;
import java.util.HashMap;

/**
 * TwoSum
 * You are given an array of integers nums and an integer target, return indices
 * of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9
 * 
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            {
                map.put(current, i);
            }

        }
        return new int[] {};

    }

}