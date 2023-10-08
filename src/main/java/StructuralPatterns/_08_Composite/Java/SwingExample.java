package StructuralPatterns._08_Composite.Java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // 프레임에 text나 버튼등을 더할 수 있음, Composite 객체

        JTextField textField = new JTextField(); // leaf
        textField.setBounds(200,200,200,40);
        frame.add(textField);

        JButton button = new JButton("click"); // leaf
        button.setBounds(200,100,60,40);
        button.addActionListener(e -> textField.setText("Hello Swing"));

        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
