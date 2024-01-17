package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        String[] newStr = sentence.toLowerCase().replaceAll("[.,]", "").split(" ");

        if (!sentence.isEmpty()) {
            for (String s: newStr) {
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s) + 1);
                } else {
                    hashMap.put(s, 1);
                }
            }
        }
        return hashMap;
    }
}
