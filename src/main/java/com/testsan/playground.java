package com.testsan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class playground {

    public static void main(String args[]){
        String[] strArr = {"ello","test", "refrerence"};

        List<String> strList = Arrays.asList(strArr);

        Consumer<String> con2 = System.out::println;
        con2.accept("Hello");

        strList.forEach(System.out::println);
        strList.stream().forEach (
            (s)->System.out.println("lambada way to print: "+ s));

           List newFilteredList =  strList.stream()
            .map(s->s.toUpperCase())
            .filter(s->!s.startsWith("s")) //predicate 
            .collect(Collectors.toList());

        newFilteredList.forEach(System.out::println);

        Thread  t = new Thread (()->System.out.println("runnbale interface implementation"));
        t.start();

        Predicate<Integer> noGreaterThan5 =  x -> x > 5;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5) //accepts predicate functional interface implemented by lambda expression
                .collect(Collectors.toList());

        System.out.println("Greated Than 5 items" +collect); 
        
        //Consumer Functional Interface in java which can be assigned to lambda  expression
        // Other usages are in Strem API of collection such as Predicate for filtering, and Thread's Runnable interface. 
        Consumer<String> cons =	(t1) -> System.out.println("printing with params values:"+t1);
        cons.accept("Test Consumer");
        
        

    }
    
}
