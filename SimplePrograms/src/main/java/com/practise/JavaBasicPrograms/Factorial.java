package com.practise.JavaBasicPrograms;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1 ,number = 6;
        for(int i= 0; i<6 ;i++){
            fact = fact * (number-i);
        }
        System.out.println(fact);
    }
}
