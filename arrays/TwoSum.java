package arrays;

import java.util.*;

/*
 * Problem: Two Sum (https://leetcode.com/problems/two-sum/)
 * Approach: Use a HashMap to store each number and its index; for each element, check if (target - current) exists.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {}; 
    }
}
