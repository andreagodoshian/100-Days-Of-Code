package org.example.day21to30;

import java.util.HashMap;

/*
SUGGESTION FROM JAVA BRAINS:
Just go through it - don't try to "catch"
If you find something greater, then subtract
*/
public class RomanToInt {

    public static void main(String[] args) {

        System.out.println("Value: " + solution("MCMXCIV"));

    }

    public static int solution(String s) {
        System.out.println(String.format("Starting with: %s", s));
        int answer = 0;
        if (s == null) return answer;

        // easy way to correlate letters+numbers
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); // key - value
        map.put('V', 5); // key - value
        map.put('X', 10); // char is the key
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            // don't need s.toCharArray() - just use s.charAt()
            char ch = s.charAt(i);

            // don't need to store previous index
            if(i>0 && map.get(ch) > map.get(s.charAt(i-1))) {
                answer += map.get(ch) - 2*map.get(s.charAt(i-1));
            }
            else answer += map.get(ch);
        }
        return answer;
    }
}