package com.pzn.generik.app;

import com.pzn.generik.dto.MyData;

/*
    implementasi generik class
 */
public class GenerikClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Agung");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
