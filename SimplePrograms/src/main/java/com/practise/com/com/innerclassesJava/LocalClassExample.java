package com.practise.com.com.innerclassesJava;

/*
 *   A local class (Class inside a method) has access to the members of its enclosing class with static scope being able to access static elements directly and non  static non static direcly and vice versa using objects
 *    a local class has access to local variables. However, a local class can only access local variables that are declared final. When a local class accesses a local
    variable or parameter of the enclosing block, it captures that variable or parameter. For example, the PhoneNumber constructor can access the local variable
    numberLength because it is declared final; numberLength is a captured variable.
    * Local classes are similar to inner classes because they cannot define or declare any static members
 *
 */
public class LocalClassExample {

    String regularExpression = "[^0-9]";
    int check = 10;

    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2) {




        LocalClassExample localClassExample = new LocalClassExample();

         //static final int check = 1;

        System.out.println(localClassExample.check);

        //final int numberLength = 10;

        // Valid in JDK 8 and later:

        int numberLength = 10;
        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(localClassExample.regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;


                System.out.println(localClassExample.check);
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:

//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        LocalClassExample localClassExample = new LocalClassExample();
        localClassExample.validatePhoneNumber("123-456-7890", "456-7890");
    }
}