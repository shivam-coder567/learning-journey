import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        @SuppressWarnings("unchecked")

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int number : map.keySet()) {
            int frequency = map.get(number);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(number);
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int number : buckets[i]) {
                    result[index] = number;
                    index++;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 5, 5, 2, 2, 8, 8, 8, 8 };
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}