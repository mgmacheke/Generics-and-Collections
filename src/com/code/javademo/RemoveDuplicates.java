package com.code.javademo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){
        // create a tangueTwister string
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel I feel, I feel the feel you feel";

        // create a word hashSet.
        Set<String> words = new HashSet<>();

        // remove dulicates by looping through the HashSet
        for(String ord : tongueTwister.split("\\W+"))
        words.add(ord);

        // print the original string
        System.out.println("the oringinal: " + tongueTwister);

        // print words
        System.out.println("no duplicate: " + words);
    }
}
