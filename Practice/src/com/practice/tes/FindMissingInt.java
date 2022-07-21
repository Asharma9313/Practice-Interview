package com.practice.tes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingInt {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,6,5,1}));
        System.out.println(solution(new int[]{-1,-3}));
    }
    public  static  int solution(int[] A) {
        Set<Integer> myList= Arrays.stream(A).filter(e->e>0).boxed().collect(Collectors.toSet());
       OptionalInt result =  IntStream.range(1,A.length+1).filter(e->!myList.contains(e)).findFirst();
       return result.getAsInt();

    }

    public  static  void duplicate(int[] A) {
        List<Integer> myList= Arrays.stream(A).filter(e->e>0).boxed().collect(Collectors.toList());


    }
}
