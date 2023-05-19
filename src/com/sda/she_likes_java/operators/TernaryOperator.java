package com.sda.she_likes_java.operators;

public class TernaryOperator {
    //three way Operator
    public static void main(String[] args) {
        System.out.println(getMyName(true));
        System.out.println(getMyName(false));
    }
    public static String getMyName(boolean fullName) {
        //if condition is true return first part otherwise return second
        String result = fullName ? "Ilga Miezaine-Mustermane" : "Ilga";
        return result;
    //    if (fullName) {
    //        return "Ilga Miezaine-Mustermane";
    //    } else {
    //        return "Ilga";
        }
    }

