package org.example.day21to30;

import javax.crypto.spec.PSource;

public class CommonPrefix {

    public static void main(String[] args) {

        String[] myArr1 = new String[]{"flower", "flow", "flight"};
        String[] myArr2 = new String[]{"dog"};
        String[] myArr3 = new String[]{"car", "bar", "tar"};
        System.out.println(solution(myArr1));
        System.out.println(solution(myArr2));
        System.out.println(solution(myArr3));

    }

    public static String solution(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
