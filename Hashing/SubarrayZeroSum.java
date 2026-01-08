package Hashing;

import java.util.HashMap;

// Time: O(n), Space: O(n)
// Pattern: Prefix Sum + HashSet (if a prefix sum repeats, subarray sum between them is 0)

class subarrayZeroSum {
    
    public boolean subarrayZeroSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int  prefixSum = 0;

        for (int x : nums) {
            prefixSum = prefixSum + x;

            if(prefixSum ==0)
                return true;

            if(map.containsKey(prefixSum)){
                return true;
            }

            map.put(prefixSum,x);

        }
        return false;
    }
}
