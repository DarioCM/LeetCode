package org.example;

/**
 * Given an arbitrary text document written in English, write a program that will generate a concordance, i.e.
 * an alphabetical list of all word occurrences.  Label each word with the total number of times given, along with
 * the sentence numbers in which each occurrence appeared.
 **/


/**
 * Example Output:
 *
 * 35 distinct words were found.
 * a {2:1,1}
 * all {1:1}
 * along {1:2}
 * alphabetical {1:1}
 * an {2:1,1}
 * appeared {1:2}
 * arbitrary {1:1}
 * concordance {1:1}
 * document {1:1}
 * each {2:2,2}
 * english {1:1}
 * generate {1:1}
 * given {2:1,2}
 * i.e {1:1}
 * in {2:1,2}
 * label {1:2}
 * list {1:1}
 * number {1:2}
 * numbers {1:2}
 * occurrence {1:2}
 * occurrences {1:2}
 * of {2:1,2}
 * program {1:1}
 * sentence {1:2}
 * text {1:1}
 * that {1:1}
 * the {2:2,2}
 * times {1:2}
 * total {1:2}
 * which {1:2}
 * will {1:1}
 * with {2:2,2}
 * word {2:1,2}
 * write {1:1}
 * written {1:1}
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***
 * Example 2:
 * String text = "Sentence one.  SENTENCE two.  SenTence three?  SenTence four";
 *
 * 5 distinct words were found.
 *  four {1:4}
 *  one {1:1}
 *  sentence {4:1,2,3,4}
 *  three {1:3}
 *  two {1:2}
 *
 */


/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
        String text = "Given an arbitrary text document written in English, write a program that will generate a " +
                "concordance, i.e. an alphabetical list of all word occurrences.  Label each word with the total number " +
                "of times given, along with the sentence numbers in which each occurrence appeared.";

        String[] arrayS = text.split(" ");


        HashMap<String, List<Integer>> map = new HashMap<>();
        int i=1;
        for(var s : arrayS){
            if(!s.isEmpty()){
                //map.put(s, map.getOrDefault(s, 0) + 1);
                List<Integer> adjList = map.getOrDefault(s, new ArrayList<>());
                if(s.matches(".")){
                    i++;
                }
                adjList.add(i);
                map.put(s, adjList);
            }
        }

        map.forEach((key, value) -> System.out.println(key + ":" + value));

// - read de document -- nio library
// - read input stream
// - line, string
        // split,
        // String[]
        // Hashmap <string, integer>
        // iterate the hasmap, key, ocurrences --> result

// -- text --. stream --> collector,

    }
}