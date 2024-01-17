package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int key: sourceMap.keySet()) {
            hashMap.putIfAbsent(sourceMap.get(key), key);
        }
        return hashMap;
    }
}
