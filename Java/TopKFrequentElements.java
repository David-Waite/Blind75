package com.blind75.arraysandhashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int number : nums) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int number : count.keySet()) {
            freq[count.get(number)].add(number);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int number : freq[i]) {
                result[index++] = number;
            }
        }

        return result;
    }
}
