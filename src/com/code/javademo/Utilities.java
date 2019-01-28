package com.code.javademo;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    // generic method that takes two generic parameter
    public static <T> void fill(List<T> list, T val){
        // set a list of values
        for(int i = 0; i < list.size(); i++){
            list.set(i,val);
        }
    }

    public static void main(String[] args){
        // create a Array object
        List<Integer> intList = new ArrayList<>();

        // add two int to the list
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // print the original list
        System.out.println("the original list: " + intList);

        //call the fill method
        Utilities.fill(intList, 110);

        //print the list
        System.out.println("called the Utilities.fill method: " + intList);
    }
}
