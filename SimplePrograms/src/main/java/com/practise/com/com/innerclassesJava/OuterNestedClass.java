package com.practise.com.com.innerclassesJava;

/*
  *Instance methods can access instance variables and instance methods directly.
  *Instance methods can access class variables and class methods directly.
  *Class methods can access class variables and class methods directly.
  *Class methods cannot access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as
    there is no instance for this to refer to.
    * Inside a static block or non-static block another static element is not possible.Static variables always belong to class level declarations
    * Acccessing a static method from a non-static method we need to use the class variable and the method name.
    * when trying to access the non static content from the static context we need to use the object of the class.
    * when
 */
public class OuterNestedClass {

    static String OuterClassStaticString = "Outer class Static Variable";
    String OuterClassNonStaticString = "Outer class Non Staic Variable";

    static void outerClassStaticMethod() {


        System.out.println(OuterNestedClass.OuterClassStaticString);
        OuterNestedClass outerNestedClass = new OuterNestedClass();
        System.out.println(outerNestedClass.OuterClassNonStaticString);

        InnerStaticClass.InnerStaticClassStaticMethod();
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        innerStaticClass.InnerStaticClassNonStaticMethod();
        innerStaticClass.InnerStaticClassStaticMethod();// this is possible but not recommended
        outerNestedClass.outerClassNonStaticMethod();
    }


    public void outerClassNonStaticMethod() {
        String OuterClassNonStaticString = "Outer class Non Staic Variable";

        outerClassStaticMethod();
        System.out.println(OuterNestedClass.OuterClassStaticString);
        System.out.println(OuterClassNonStaticString);
        OuterNestedClass outerNestedClass = new OuterNestedClass();
        OuterNestedClass.InnerNonStaticClass innerNonStaticClass = outerNestedClass.new InnerNonStaticClass();   /* Accessing a non static innerclass method from a non static outer*/
        innerNonStaticClass.InnerClassOnlyNonStaticMethod("hi");                               /* class method */
    }

    public class InnerNonStaticClass {
        /*
           STATIC STRING CHECKING = "CHECKING STRING"; -|
                                                        |-> NON STATIC INNER CLASSES CANNOT HAVE STATIC DECLARATIONS OR METHODS
                                                        |-> because an inner class is associated with an instance, it cannot define any static members itself.
           public static void checking(){}  ------------|
        */
        final static String checking = "hello";     /* this is possible as the variable is final */

        public String InnerClassOnlyNonStaticVariable = "InnnerClassOnlyNonStaticVariable";

        public void InnerClassOnlyNonStaticMethod(String check) {
            System.out.println(InnerClassOnlyNonStaticVariable + "   " + check);
            System.out.println(OuterClassNonStaticString);
            System.out.println(OuterClassStaticString);
        }

    }

    static class InnerStaticClass {

        static String innerStaticClassStaticVariable = "INNERSTATICCLASSSTATICVARIABLE";

        public static void InnerStaticClassStaticMethod() {
            OuterNestedClass.outerClassStaticMethod();

            OuterNestedClass outerNestedClas = new OuterNestedClass();
            outerNestedClas.outerClassNonStaticMethod();


        }

        public String InnerStaticClassNonStaticVariable = "INNERSTATICCLASSNONSTATICVARIABLE";

        public void InnerStaticClassNonStaticMethod() {
            OuterNestedClass.outerClassStaticMethod();
        }


    }

}
