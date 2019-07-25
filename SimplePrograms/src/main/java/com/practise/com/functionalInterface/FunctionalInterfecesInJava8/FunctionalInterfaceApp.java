package com.practise.com.functionalInterface.FunctionalInterfecesInJava8;

import java.util.function.Supplier;

public class FunctionalInterfaceApp {
    /*
     * There will a interface with a single method with some declaration but no definition.
     * We can use the Lambda Expression Syntax to have the implementation of the method in a single line.
     * to learn Using that lamba Expression Implementation to pass around and play with it.
     *
     *
     * */
    public static void main(String[] args) {
      /* Example 1:- Function<Long, Long> adder = (value)-> value + 7;
        Long result = adder.apply((long) 4);
        System.out.println("result = " + result);*/


/* Example 2: Integer Implementation of the PractiseFunctionalInterface interface
        PractiseFunctionalInterface<Integer ,Integer > intImplementation = (value) -> value + 9;
        System.out.println(intImplementation.checking(20));
 */

/* Example 3: Strig Implementaion of the PractiseFunctionalInterface interface

        PractiseFunctionalInterface<String,Integer> stringCountImplementation = (stringValue)-> stringValue.length();
        int size = stringCountImplementation.checking("Naveen Kumar Daroju");
        System.out.println(size);
 */
/*
Example 4: Passing an int to the functional interface and then returning the multiplication of the Number

 PractiseFunctionalInterface<Integer, Integer> multiply = (value) -> value * value;
        System.out.println(multiply.checking(65));
 */

        Supplier<Integer> integerSupplier = () -> new Integer((int) (Math.random() * 1000D));
        System.out.println(integerSupplier.get());


    }

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }



    @FunctionalInterface
    public interface PractiseFunctionalInterface<T, R> {

        public R checking(T parameter);
    }

}
