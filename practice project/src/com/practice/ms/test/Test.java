package com.practice.ms.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test<T> {
    T value;
    public Test(T value){
        this.value= value;
    }
    public  T getValue(){
        return  value;
    }

public static  void main(String[] gg){
        Test<String> first = new Test<>("a string");
        Test<Integer> two = new Test<>(123);
        System.out.print(first.getValue());
    System.out.print(two.getValue());

    Set<? extends IOException> set = new HashSet<? extends  IOException>();
    Set<? extends IOException> set1 = new HashSet<Exception>();
    Set<? extends IOException> set2 = new TreeSet<RuntimeException>();
    Set<? extends IOException> s3 = new TreeSet<IOException>();
    Set<? extends IOException> s4 = new TreeSet<FileNotFoundException>();
}
}
