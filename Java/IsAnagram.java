package com.blind75.arraysandhashing;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> fmap = new HashMap<>();

        for (char c : s.toCharArray()) {
            fmap.put(c, fmap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()){
            if(!fmap.containsKey(c) || fmap.get(c) == 0){
                return false;
            }else {
                fmap.put(c, fmap.get(c) - 1);
            }
        }
        return true;
    }
}
