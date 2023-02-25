package org.example;

import javax.swing.*;

/**
 * author: f19t
 * Date: 2023/2/20 22:04
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CLASS转字节码");
        frame.setContentPane(new My_Gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
