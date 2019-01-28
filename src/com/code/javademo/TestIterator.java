package com.code.javademo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args){
        // create an arrayList that contain 10 elements
        ArrayList<Integer> nums = new ArrayList<>();

        // use a for loop to add the elements
        for(int i = 0 ; i < 10; i++){
            nums.add(i);
        }

        // print the elements
        System.out.println("The original list: " + nums);

        // create a Iterator object that holds arrayList elements
        Iterator<Integer> itNums = nums.iterator();

        // use a while loop to remove the elements
        while(itNums.hasNext()){
            itNums.next();
            itNums.remove();
        }

        // print the elements
        System.out.println("After removing he elements: " + nums);
    }
}
