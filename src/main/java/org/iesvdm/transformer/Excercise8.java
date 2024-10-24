package org.iesvdm.transformer;

import java.util.ArrayList;

public class Excercise8 implements Joiner<String> {
    public String join(String a, String b) {
        return a + " " + b;
    }

    public static <T> T fold(Joiner<T> j, ArrayList<T> list1) {
        T result = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            result = j.join(result, list1.get(i));
        }
        return result;
    }
}
