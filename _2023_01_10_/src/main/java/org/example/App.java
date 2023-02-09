package org.example;

/*
NEED TO KNOW:
-Palindrome checker
-The Longest common prefix
-Roman to int
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

    public static String solution(String[] arr) {
        if (arr.length == 0) return "";
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}