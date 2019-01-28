package com.code.javademo;

import java.util.Vector;

public class OldContainerTest {

    public static void main(String arg[]){

        Vector floatValues = new Vector();
        floatValues.add(10.0f);
        floatValues.add(100.0);

        for(int i = 0; i < floatValues.size(); i++){
            Float temp = (Float) floatValues.get(i);
            System.out.println(temp);
        }
    }
}
