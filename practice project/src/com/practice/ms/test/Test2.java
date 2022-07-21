package com.practice.ms.test;

public class Test2 implements  Runnable {

    public  static  Test2 obj;
    private int data;
    public  Test2(){
        data = 10;
    }
    public void run(){
        obj = new Test2();
        obj.wait();
        obj.data += 20;
    System.out.println(obj.data);
    }
    public static  void main(String[] args){
        Thread thread1 = new Thread(new Test2());
        Thread thread2 = new Thread(new myThread());

        thread1.start();;
        thread2.start();
        System.out.println(" DRM - ");

    }
}
class myThread implements Runnable{
    @Override
    public void run() {
        Test2.obj.notify();
    }
}