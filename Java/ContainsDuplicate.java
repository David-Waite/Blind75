package com.blind75.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

      Set<Integer> integerSet = new HashSet<>();
      for(int num : nums){
          integerSet.add(num);
      }

      return  integerSet.size() != nums.length;
    }
}