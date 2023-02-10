package org.example.day21to30;

public class LengthLastWord {

    public static void main(String[] args) {
        String exampleA = "I'm scared to get my tooth extracted";
        String exampleB = "Space  ... space ... and more space    ";

        System.out.println(exampleA + ": " +
                solution(exampleA));
        System.out.println(exampleB + ": " +
                solution(exampleB));
    }

    public static int solution(String str) {
        int rightIndex = str.length() - 1;
        while (rightIndex >= 0 && str.charAt(rightIndex) == ' ') {
            rightIndex--;
        } // ensures last char isn't a space

        int leftIndex = rightIndex; // ensures not a space
        while (leftIndex >= 0 && str.charAt(leftIndex) != ' ') {
            leftIndex--;
        }

        return rightIndex - leftIndex;
    }

}