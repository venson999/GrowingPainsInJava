package com.venson.growingpainsinjava.javase4;

public class AssertionFacility {

    static {
        boolean assertsEnabled = false;
        assert assertsEnabled = true; // Intentional side effect!!!
        if (!assertsEnabled)
            throw new RuntimeException("Asserts must be enabled!!!");
    }

    public static void main(String[] args) {
        assert true;
        assert false : "Error Message ...";
    }
}
