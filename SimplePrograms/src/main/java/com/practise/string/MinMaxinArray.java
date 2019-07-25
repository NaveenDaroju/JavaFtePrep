package com.practise.string;

import java.io.IOException;

public class MinMaxinArray {
    public static char readInput() {
        char c = '\u0000';
        int input = 0;
        try {
            input = System.in.read();
            if (input != 1) {
                c = (char) input;
            }
        } catch (IOException e) {
            System.out.println("An exception occured");
        }
        return c;
    }

    public static void main(String[] args) {
        char c = MinMaxinArray.readInput();
        System.out.println(c);
    }
}
