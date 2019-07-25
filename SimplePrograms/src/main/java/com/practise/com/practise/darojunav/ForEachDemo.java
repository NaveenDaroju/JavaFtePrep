/*
package com.practise.com.practise.darojunav;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ForEachDemo {
    public static void main(String[] args) {

        List<Product> products = new ArrayList();

        products.add(new Product("p3", "mobile 1", 1200, 4, null));
        products.add(new Product("p1", "mobile 1", 1000, 2, new Manufacturer(true, "tmobile", 1234)));
        products.add(new Product("p2", "mobile 2", 700, 4, new Manufacturer(false, "sprint", 7534)));
        products.add(new Product("p4", "mobile 2", 7800, 5, new Manufacturer(true, "tmobile", 5834)));
        products.add(new Product("p5", "mobile 3", 7000, 9, new Manufacturer(true, "at and t", 10234)));
        products.add(new Product("p6", "mobile 2", 800, 9, new Manufacturer(false, "lyca", 20234)));
        products.add(new Product("p7", "mobile 3", 100, 5, new Manufacturer(false, "verizon", 85234)));
        products.add(null);

        String name = null;

        Optional.ofNullable(products).orElseGet(Collections::emptyList)
                .stream()
                .forEach(
                        product -> {
                    Optional.ofNullable(product.getManufacturer()).orElse(null).ifPresent(p->{
                        name=p.getName();
                    }));
        });
.map(Product::getManufacturer)
                .filter(bingOnPredicate())
                .findFirst()
                .map(Manufacturer::getLiscenseNumber)
                .ifPresent(p -> printint(p));

 List<Product> ab  = new ArrayList<>();
        ab.add(new Product("p5", "mobile 3", 7000, 9, null));
        Optional.ofNullable(ab).orElseGet(Collections::emptyList).stream().map(Product::getManufacturer).findFirst().orElse(null);
        System.out.println("hi");
        Optional.ofNullable(ab).orElseGet(Collections::emptyList).stream().findFirst().map(Product::getManufacturer).orElse(null);
        System.out.println("bye");

        Stream<Product> stream = Optional.ofNullable(ab).orElseGet(Collections::emptyList).stream();


        //products.stream().filter(e->e.getQuantity()>3).forEach(System.out::println);
        // Optional.ofNullable(products).orElse(Collections.emptyList()).stream().forEach(product -> System.out.println(product));
        //products.stream().forEach(e->System.out.println(e.getManufacturer()));
Optional.ofNullable(products).orElse(Collections.emptyList())
               .stream()
               .filter(Objects::nonNull)
               .map(Product::getManufacturer)
               .map(Manufacturer::getName)
               .filter(Objects::nonNull)
               .forEach(p->System.out.println(p));

 Optional.ofNullable(products).orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .forEach(
                        e -> {
                            System.out.println(
                                    Optional.ofNullable(e)
                                            .map(Product::getManufacturer)
                                            .map(Manufacturer::getName)
                                            .orElse(""));
                        });


 Optional<List<Product>> productList = Optional.ofNullable(products);
        List<Product> products1 = productList.orElse(Collections.emptyList());
        //================Static Methods on the Optional class=====================================//

Optional.ofNullable(products);

Optional.of(products);

Optional.empty();

        //================methods of Optional.ofNullable(products) ================================//
        //These two have Optional As the Return//
        Optional<Object> o = Optional.ofNullable(products).map();
        Optional<Object> o1 = Optional.ofNullable(products).flatMap();

        Optional<List<Product>> products4 = Optional.ofNullable(products).filter();

        List<Product> products2 = Optional.ofNullable(products).get();//will return a list of the products
        List<Product> products3 = Optional.ofNullable(products).orElseGet();
        List<Product> products6 = Optional.ofNullable(products).orElseThrow();
        List<Product> products5 = Optional.ofNullable(products).orElse();


        boolean equals = Optional.ofNullable(products).equals();//will return a boolean if they are equal
        boolean present = Optional.ofNullable(products).isPresent();

        Optional.ofNullable(products).ifPresent();  //Is the only void method
        String s = Optional.ofNullable(products).toString();

        //===================methods of the Optional.of(products) ===================================//

       Optional.of(products);//Same methods as of the Optional.ofNullable();

        //===================methods of the Optional.empty() =========================================//

        Optional.empty().

        //Stream methods
        Stream<Product> productStream = products1.parallelStream();
        Stream<Product> stream = products1.stream();


        Optional<Product> productStreamAny = productStream.map();


        //Optional.ofNullable(products).orElse(Collections.emptyList()).stream().forEach(product -> System.out.println(product.getManufacturer()));

System.out.println("==============");
        products.iterator().forEachRemaining(e -> System.out.println(e));
        System.out.println("==============");
        products.forEach(e -> System.out.println(e));


    }

    private static Predicate<Manufacturer> bingOnPredicate() {

        return f -> "tmobile".equalsIgnoreCase(f.getName());
    }
    private static void printint(int i){
        System.out.println(i);

    }


}
*/
