package com.practise.JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        fib(number);
    }
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }
    private static int  fib(int n) {
      /* *//* int fibanocci,fiba = 0, fibb = 1;
        for(int i = 0; i<number; i++){
            fibanocci = fiba + fibb;
            System.out.println(fiba);
            fiba = fibb;
            fibb = fibanocci;*//*
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        }

        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.printf("computing fib(%d)\n", n);
        return fib(n - 1) + fib(n - 2);*/
        Map<Integer, Integer> cache = new HashMap<>();

        Integer fibonacci = cache.get(n);
            if(fibonacci != null){
                return fibonacci; //fibonacci number from cache
            }
            //fibonacci number not in cache, calculating it
            fibonacci = fibonacci2(n);

            //putting fibonacci number in cache for future request
            cache.put(n, fibonacci);
            return fibonacci;
        }

}
