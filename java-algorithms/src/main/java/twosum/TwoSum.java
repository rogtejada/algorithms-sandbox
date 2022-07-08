package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Brute force - sum all numbers together
    //O(n^2) time complexity
    //O(1) spacial complexity
    public int[] twoSum1(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    //Using hashmap
    //O(n) time complexity
    //O(n) spacial complexity
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbersMap.get(target - nums[i]) != null) {
                return new int[]{numbersMap.get(target - nums[i]), i};
            } else {
                numbersMap.put(nums[i], i);
            }
        }

        return null;
    }
}
