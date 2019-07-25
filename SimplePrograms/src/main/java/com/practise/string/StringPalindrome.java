package com.practise.string;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
    String original,reverse="";
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a strign to check if it is a palindrome or not");
        original = sn.nextLine();
        for(int i = original.length()-1;i>=0;i--)
        {
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("The string entered is a palindrome");
        }else{
            System.out.println("The entered string is not a palindrome");
        }
    }
}
