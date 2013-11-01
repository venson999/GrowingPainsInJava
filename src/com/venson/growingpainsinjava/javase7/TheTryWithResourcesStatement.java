package com.venson.growingpainsinjava.javase7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TheTryWithResourcesStatement {

    public void theTryWithResourcesStatement6(String input, String output) {

        InputStream fis1 = null;
        OutputStream fos1 = null;

        try {

            fis1 = new FileInputStream(input);
            fos1 = new FileOutputStream(output);
            fos1.write(fis1.read());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (fis1 != null) {
                try {
                    fis1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos1 != null) {
                try {
                    fis1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void theTryWithResourcesStatement7(String input, String output) {

        try (InputStream fis2 = new FileInputStream(input);
                OutputStream fos2 = new FileOutputStream(output)) {

            fos2.write(fis2.read());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
