package com.practice.ms.test;

import java.util.Arrays;
import java.util.Comparator;

public class MainClass {
    static void printValue(Animal a){
        System.out.println("ONE");
    }
    static void printValue(Dog a){
        System.out.println("two");
    }
    static void printValue(Object a){
        System.out.println("three");
    }
//public static void main(String[] gg){
//        Labrador l= new Labrador();
//        printValue(l);
//}
    enum  AnimalsA{
        LION,DOG,COW
}
//    public static void main(String[] gg){
//       Integer number =  10;
//       number++;
//       assert number ==null && number>=0;
//       System.out.println(number);
//    }
//    public static void main(String[] gg){
//      AnimalsA[] a=AnimalsA.values();
//      System.out.println(a[1]);
//    }
//    public static void main(String[] gg) {
//        Comparator<Integer> numberComparator = (number1, number2) -> number2.compareTo(number1);
//
//        Integer arr[] = {1, 4, 3, 2};
//        Arrays.sort(arr,numberComparator );
//        for(Integer number:arr){
//            System.out.print(number+"");
//        }
//    }
    public void divide(int a,int b){
        try{
            int c = a/b;
        }finally {
            System.out.println("Finally");
        }
    }
    public static void main(String[] gg) {

         MainClass obj = new MainClass();

     try{
            obj.divide(3,0);
     }catch(RuntimeException re){
         System.out.println("Runtime exception");
     }catch(Exception e){
         System.out.println("Exception");
     }finally {
         System.out.println("Finally end");
     }
    }
}
class Animal{

}
class Dog extends Animal{

}
class Labrador extends Dog{

}
