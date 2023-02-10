package org.example.day11to20;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input = new String[]{"eat", "tea", "ten", "ate", "net", "bet"};
        System.out.println(decode(input));
    }

    public static List<List<String>> decode (String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String x: words) {
            char[] charArr = x.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(x);
        }
        return new ArrayList<>(map.values());
    }
}
