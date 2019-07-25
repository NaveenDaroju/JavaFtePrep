package com.practise.com.com.innerclassesJava;

public class StringTypes {

    // Concatenates to String
    public static String concat1(String s1) {
        return s1 = s1 + "forgeeks";
    }

    // Concatenates to StringBuilder
    public static StringBuilder concat2(StringBuilder s2) {
        return s2.append("forgeeks");
    }

    // Concatenates to StringBuffer
    public static StringBuffer concat3(StringBuffer s3) {
        return s3.append("forgeeks");
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Geeks");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Geeks");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
    }
}



