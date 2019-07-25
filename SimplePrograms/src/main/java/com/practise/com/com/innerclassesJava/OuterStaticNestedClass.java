package com.practise.com.com.innerclassesJava;

public class OuterStaticNestedClass {
    static String StaticString =  "Outer class Static Variable";
    String NonStaticString = "Outer class Non Staic Variable";

    static class StaticNestedClass{

        static String StaticInnerclassStaticString =  "Static Inner class Static Variable";
        String StaticInnerclassNonStaticString = "Static Inner class Non Staic Variable";

        public void printCheck()
        {
            System.out.println(StaticString);
        }
    }

     class NonStaticNestedClass{
        /*
        STATIC STRING CHECKING = "CHECKING STRING"; -|
                                                     |->  NON STATIC INNER CLASSES CANNOT HAVE STATIC DECLARATIONS OR METHODS
        public static void checking(){   ------------|

        }

         */

         String NonStaticInnerclassStaticString = "non static Innerclass static string";
         public void NonStaticNestedClassNonStaticMethod()
         {
             System.out.println(NonStaticInnerclassStaticString);
         }

    }
    public static void main(String[] args) {
        OuterStaticNestedClass.StaticNestedClass innerNested= new StaticNestedClass();
        OuterStaticNestedClass outerStaticNestedClass= new OuterStaticNestedClass();
        innerNested.printCheck();
        checkOuterStaticBlock();
        outerStaticNestedClass.checkOuterNonStaticBlock();
        /*System.out.println(NonStatic);*/

    }

    static void checkOuterStaticBlock(){
        System.out.println("Static Method");
        /*System.out.println(NonStatic);*/
        System.out.println(StaticString);
    }

    public void checkOuterNonStaticBlock(){
        System.out.println("non-static method Access");
        System.out.println(NonStaticString);
        System.out.println(StaticString);
    }
}
