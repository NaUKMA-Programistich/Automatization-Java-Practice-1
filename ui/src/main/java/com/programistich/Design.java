package com.programistich;

import javax.swing.*;

public class Design {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("logging");
        button.setBounds(130,100,100, 40);
        button.addActionListener(action -> Logging.info("Click on Button"));
        frame.add(button);
    }
}