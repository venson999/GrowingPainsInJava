package com.venson.growingpainsinjava;

public class StringCompare {

    public static void main(String[] args) {

        String a = "aa";
        String b = "aa";
        String c = "a" + "a";
        String d = new String("aa");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
