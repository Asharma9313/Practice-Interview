package com.practice.tes;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
//        int num = 20;
//        int[] arr= {2,5,6,8,9,10,12};
//        System.out.println(arr);
//        Thread t1=new Thread(new A());
//        Thread t2 = new Thread(new A());
//        int[] arr={1,2,3,4,5,6};
//        Arrays.asList(arr).stream().forEach(e->{
//            System.out.println(Integer+5);
//        });
//        String a="20";
//        String b="30";
        String a=new String("20");
        String b=new String("30");
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
//        Employee a=new Employee();
//        a.name="Ashwini";
//        Employee b=new Employee();
//        b.name="Sharma";
//        swap(a,b);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }

    public static void reverseArray(int[] a){
        for(int i=0,j=a.length-1;i<a.length && j>=0;i++,j--){
            int temp = a[i];
            a[i]=a[j];
            a[j] = temp;
        }
    }
    public static void swap(String a,String b){

            String temp = a;
            a=b;
            b = temp;

    }
//    public static void swap(Employee a,Employee b){
//
//        String temp = a.name;
//        a.name=b.name;
//        b.name = temp;
//
//    }

}

class A implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

//Employee table --> id , name, deptId,salary
//Department table --> deptId,dptName

// Select deptId,max(salary) from Employee group by deptId;


//child c = new child();

//String a=20
//String b=30
//swap(a,b);
//sout(a);
//sout(b);
class Employee{
    String name;

}

