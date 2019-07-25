package com.practise.string;

public class WordSequenceReverse {

    public static void main(String[] args) {
        String original = "hello this is naveen from tmobile";
        String reverse = "";
        String[] test = original.split(" ");
        for (int i = test.length - 1; i >= 0; i--) {
            reverse = reverse + test[i] + " ";
        }
        System.out.println(reverse);

    }
}
