package com.citi.test;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(isPermutation("hello", "lloeh")); // should be true
        System.out.println(isPermutation("hello", "bye")); // should be false
        System.out.println(isPermutation("", "")); // should be true
        System.out.println(isPermutation("", "sscs")); // should be false
        System.out.println(isPermutation("hello", "hello")); // should be true
        System.out.println(isPermutation("helloo", "llloeh")); // should be false
    }

    public static boolean isPermutation(String first, String second) {

        if (first.length() != second.length())
            return false;

        Map<Character, Integer> firstMap = getCharacterApperanceCount(first);
        Map<Character, Integer> secondMap = getCharacterApperanceCount(second);

        return firstMap.equals(secondMap);
    }

    private static Map<Character, Integer> getCharacterApperanceCount(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++){
            map.merge(str.charAt(i), 1, (oldV, newV) -> ++oldV);
        }

        return map;
    }


}