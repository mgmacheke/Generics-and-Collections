package com.code.javademo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args){
        // create a string that holds the input value
        String pal = "abcba";

        // create a list object
        List<Character> lisPal = new LinkedList<Character>();

        // add for loop each char into the list object
        for(char c : pal.toCharArray())
            lisPal.add(c);

            // print the full input String
            System.out.println("the full palindrome is: " + pal);

            // create a list that takes string from left to right
            ListIterator<Character> forward = lisPal.listIterator();

            // create a list that takes string from right to left
            ListIterator<Character> backward = lisPal.listIterator(lisPal.size());

            // create a while to check if its a palindrome
            boolean result = true;
            while(backward.hasPrevious() && forward.hasNext()){
                if(backward.previous()!= forward.next()){
                    result = false;
                    break;
                }
            }
            if(result){
            System.out.println("it's a palindrome ");
        }else
            System.out.println("it's not a palindrome");
        // if it is a palindrome than print
        // if it is not a palindrome than print
    }
}
