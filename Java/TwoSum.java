package com.blind75.arraysandhashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if(freqMap.containsKey(target - nums[i]) && freqMap.get(target - nums[i]) != i){
                return new int[]{i,freqMap.get(target - nums[i])};
            }
        }
    return new int[]{};
    }
}
