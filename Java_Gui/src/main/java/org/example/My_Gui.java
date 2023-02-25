package org.example;

import javax.swing.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * author: f19t
 * Date: 2023/2/20 19:44
 */
public class My_Gui {
    JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JTextArea textArea1;
    public My_Gui() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField1.getText();
                test t = new test();
                try {
                    String ss = t.readFromByteFile(s);
                    textArea1.append(ss+"\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }


}
