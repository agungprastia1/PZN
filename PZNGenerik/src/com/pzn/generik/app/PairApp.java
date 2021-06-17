package com.pzn.generik.app;

import com.pzn.generik.dto.Pair;

/*
    membuat implementasi generik class
    2 parameter
 */
public class PairApp {
    public static void main(String[] args) {
        Pair<String,Integer> stringIntegerPair = new Pair<>("Agung",10);
        Pair<String,String> stringStringPair = new Pair<>("agung","prasetia");

        var first = stringIntegerPair.getFirst();
        var last= stringIntegerPair.getLast();

        var first1=stringStringPair.getFirst();
        var last1= stringStringPair.getLast();
        System.out.println(first+last);
        System.out.println(first1+last1);
        System.out.println(stringIntegerPair.getFirst());
        System.out.println(stringIntegerPair.getLast());
    }
}
