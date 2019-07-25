package com.practise.com.daroju.fte;

import java.math.BigDecimal;

public class PrimeOrNot {
    public static void main(String[] args) {


        final BigDecimal[] sales = {new BigDecimal(0)};
       for(int i =0;i<10;i++) {
          sales[0]= sales[0].add(BigDecimal.valueOf(10.00));
System.out.println(sales[0]);
       }
    }
}
