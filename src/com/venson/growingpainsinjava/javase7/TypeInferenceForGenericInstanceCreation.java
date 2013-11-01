package com.venson.growingpainsinjava.javase7;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceForGenericInstanceCreation {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // javase6
        List<String> list6 = new ArrayList<String>();

        // javase7
        List<String> list7 = new ArrayList<>();
    }
}
