package rugeekbrains.Ni1.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    public Counter() {
        setTitle("Counter App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,200,400,100);

        Font font = new Font("Arial", Font.BOLD, 24);
        JLabel counterValueView = new JLabel("123");
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setFont(font);
        add(counterValueView, BorderLayout.CENTER);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = counterValueView.getText();
                int i = Integer.parseInt(text) - 1;
                counterValueView.setText(String.valueOf(i));
            }
        });
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = counterValueView.getText();
                int i = Integer.parseInt(text) + 1;
                counterValueView.setText(String.valueOf(i));
            }
        });

        setVisible(true);
    }
    public static void main (String[] args){
        new Counter();
    }
}
