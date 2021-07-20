package com.pzn.generik.app;

import com.pzn.generik.dto.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Agung","prasetia","Stta"};
        Integer[] name = {1,2,3,4,5,6,7};

        System.out.println(
                ArrayHelper.count(names)
        );

        System.out.println(
                ArrayHelper.<Integer>count(name)
        );
    }
}
