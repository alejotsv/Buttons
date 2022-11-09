package com.java21days;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateButtons {
    public static void main(String[] args) {
        ArrayList<String> buttonText = new ArrayList(Arrays.asList("Save", "Update", "Cancel"));
        for (String btn : buttonText) {
            System.out.println(btn);
        }

//        ButtonsFrame frame = new ButtonsFrame();
    }
}
