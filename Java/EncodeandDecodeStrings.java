package com.blind75.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String word : strs) {
            encoded.append(word.length()).append("!").append(word);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decoded = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder word = new StringBuilder();

            StringBuilder lengthString = new StringBuilder();

            while (str.charAt(i) != '!') {
                lengthString.append(str.charAt(i));
                i++;
            }

            int length = Integer.parseInt(String.valueOf(lengthString));
            i++;
            for (int j = i; j < i + length; j++) {
                word.append(str.charAt(j));
            }

            decoded.add(word.toString());
            i += length - 1;

        }
        return decoded;
    }
}
