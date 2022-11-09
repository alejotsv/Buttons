package com.java21days;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateButtons {
    public static void main(String[] args) {
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        ArrayList<String> buttonText = new ArrayList(Arrays.asList("Save", "Update", "Cancel"));
        for (String button : buttonText) {
            System.out.println(button);
        }



//        ButtonsFrame frame = new ButtonsFrame();
    }
}
