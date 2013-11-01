package com.venson.growingpainsinjava.javase5;

public class TypesafeEnums {

    public static void main(String[] args) {
        paint(Color.RED);
        paint(Color.GREEN);
        paint(Color.BLUE);
    }

    public enum Color {

        RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

        private int redValue;

        private int greenValue;

        private int blueValue;

        Color(int rv, int gv, int bv) {
            redValue = rv;
            greenValue = gv;
            blueValue = bv;
        }

        public int getRedValue() {
            return redValue;
        }

        public int getGreenValue() {
            return greenValue;
        }

        public int getBlueValue() {
            return blueValue;
        }
    };

    public static void paint(Color c) {
        System.out.println(c);
        System.out.printf("R:%3d G:%3d B:%3d", c.getRedValue(), c.getGreenValue(), c.getBlueValue());
        System.out.println();
    }
}
