package com.venson.growingpainsinjava.javase5;

public class Autoboxing {

    public static void main(String[] args) {
        Integer result = sum(1, 2);
        System.out.println(result);
    }

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
