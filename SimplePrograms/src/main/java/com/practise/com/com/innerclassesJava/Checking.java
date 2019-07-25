package com.practise.com.com.innerclassesJava;

import com.practise.com.com.innerclassesJava.OuterNestedClass;

public class Checking {
    public static void main(String[] args) {
        OuterNestedClass outerStaticNestedClass=new OuterNestedClass();
        OuterNestedClass.InnerNonStaticClass innerNonStaticClass =  outerStaticNestedClass.new InnerNonStaticClass();

        innerNonStaticClass.InnerClassOnlyNonStaticMethod("hello");



    }


}


