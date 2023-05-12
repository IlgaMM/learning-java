package com.sda.she_likes_java.homework.exercise24;

import java.util.HashMap;

public class EnglishLithuanianDictionary {
    private HashMap <String, String> dictionary;

    public EnglishLithuanianDictionary() {
        dictionary = new HashMap<String,String>();

        dictionary.put("hello", "labas");
        dictionary.put("goodbye", "viso gero");
        dictionary.put("cat", "katė");
        dictionary.put("dog", "šuo");
        dictionary.put("computer", "kompiuteris");
        dictionary.put("house", "namas");
        dictionary.put("book", "knyga");
        dictionary.put("car", "automobilis");
        dictionary.put("coffee", "kava");
        dictionary.put("water", "vanduo");
    }
    public String translate(String englishWord) {
        String lithuanianWord = dictionary.get(englishWord);
        if (lithuanianWord == null) {
            return "Sorry, the dictionary does not support this word.";
        }
        return lithuanianWord;
    }

}
