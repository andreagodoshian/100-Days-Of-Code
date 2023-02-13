package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-Common prefix
-Valid Parenthesis
-Remove Array Element
-Roman -> int
*/

public class App
{
    public static void main( String[] args ) {
        System.out.println("Hej Världen!");

        String[] myArr1 = new String[]{"flower", "flow", "flight"};
        String[] myArr2 = new String[]{"dog"};
        String[] myArr3 = new String[]{"car", "bar", "tar"};
        System.out.println(solution(myArr1));
        System.out.println(solution(myArr2));
        System.out.println(solution(myArr3));
    }


    public static String solution(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}