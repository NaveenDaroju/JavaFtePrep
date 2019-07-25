package com.practise.string;

public class StringReverse {
    public static void main(String args[]) {
        String original = "Hello this is naveen ";
        String reverse = "";
        char test[] = original.toCharArray();
        for (int i = test.length - 1; i >= 0; i--) {
            reverse = reverse + test[i];
        }
        System.out.println(reverse);
    }
}
