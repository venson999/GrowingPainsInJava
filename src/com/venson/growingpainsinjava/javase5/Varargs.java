package com.venson.growingpainsinjava.javase5;

public class Varargs {

    public static void main(String[] args) {
        printAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    }

    public static void printAll(int... integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
}
