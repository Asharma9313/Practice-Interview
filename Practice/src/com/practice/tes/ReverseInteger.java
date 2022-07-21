package com.practice.tes;

public class ReverseInteger {
    public static void main(String[] args) {
        int var=123;
        String rev=Integer.toString(var);
        rev= rev.substring(rev.length()-1,0);
        System.out.println(Integer.parseInt(rev));

    }
}
