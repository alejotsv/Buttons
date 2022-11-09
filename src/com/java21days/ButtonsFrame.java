package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ButtonsFrame extends JFrame {

    ButtonsFrame(String title, Dimension d, ArrayList<JButton> buttons){
        super(title);
        setSize(d);
        JPanel panel = new JPanel();
        for (JButton button : buttons) {
            panel.add(button);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panel);
        pack();
        setVisible(true);
    }
}
