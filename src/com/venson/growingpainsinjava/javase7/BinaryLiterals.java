package com.venson.growingpainsinjava.javase7;

public class BinaryLiterals {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // An 8-bit 'byte' value:
        byte aByte = (byte)0b00100011;

        // A 16-bit 'short' value:
        short aShort = (short)0b1010000101000111;

        // Some 32-bit 'int' values:
        int anInt1 = 0b10100001010001011010000101000111;
        int anInt2 = 0b111;
        int anInt3 = 0B111; // The B can be upper or lower case.

        // A 64-bit 'long' value. Note the "L" suffix:
        long aLong = 0b1010000101000101101000010100010110100001010001011010000101000111L;
    }
}
