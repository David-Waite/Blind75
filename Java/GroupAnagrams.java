package com.blind75.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs) {
            int[] asciiArray = new int[26];

            for (char letter : word.toCharArray()) {
                asciiArray[(int) letter - 'a']++;
            }

            String asciiWordValue = Arrays.toString(asciiArray);
            List<String> anagramGroup = anagramMap.getOrDefault(asciiWordValue, new ArrayList<String>());
            anagramGroup.add(word);
            anagramMap.put(asciiWordValue, anagramGroup);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
