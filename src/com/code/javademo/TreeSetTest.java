package com.code.javademo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        // create a string
        String pangram = "the quick brown fox jumps over the lazy dog";

        // create a treeSet
        Set<Character> aToZ = new TreeSet<Character>();

        // add the String into the treeSet
        for(char gram : pangram.toCharArray())
            aToZ.add(gram);

        // print the original string
        System.out.println("the original string: " + pangram);

        // pring the treeset
        System.out.println("the A to Z string: " + aToZ);

    }
}
