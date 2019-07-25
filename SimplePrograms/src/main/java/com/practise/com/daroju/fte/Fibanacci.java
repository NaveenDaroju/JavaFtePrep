package com.practise.com.daroju.fte;

/*
The fibonacci series works on the formulea
fn = fn-1 + fn-2;
 */
public class Fibanacci {
    public static void main(String[] args) {
        fibgen();

    }

    public static void fibgen() {
        int a = 0, b = 0, c = 1;
        for (int i = 1; i <= 20; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }
}
