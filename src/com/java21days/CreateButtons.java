package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateButtons {
    public static void main(String[] args) {
        Dimension d = new Dimension(1000, 1000)
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        ArrayList<String> buttonText = new ArrayList(Arrays.asList("Save", "Update", "Cancel"));
        for (String button : buttonText) {
            JButton btn = new JButton(button);
            buttons.add(btn);
        }

        ButtonsFrame frame = new ButtonsFrame();
    }
}
