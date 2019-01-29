package com.code.javademo;

import java.util.HashMap;
import java.util.Map;

public class SpellChecker {

    public static void main(String[] args) {
        // create a hashMap
        Map<String, String> misspelled = new HashMap<String, String>();

        // add key and value to the hashMap
        misspelled.put("musa", "mosa");
        misspelled.put("macheke", "majeke");
        misspelled.put("existence", "existance");

        // add a string with a sentence
        String sentence = " Hi my name is musa macheke";
        System.out.println(sentence);

        //check if the correct word exists and print it
        for (String word : sentence.split("\\W+")){
            if(misspelled.containsKey(word)){
                System.out.println("the correct word for " + word + " is " + misspelled.get(word));
            }
        }
    }
}
