package rugeekbrains.Ni1.HomeWork8;

import javax.swing.*;
import java.awt.*;

public class Counter extends JFrame {
    public Counter() {
        setTitle("Counter App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,400,400,400);

        Font font = new Font("Arial", Font.BOLD, 24);
        JLabel counterValueView = new JLabel("123");
        counterValueView.setFont(font);
        add(counterValueView, BorderLayout.CENTER);

        JButton decrementButton = new JButton("<");
        add(counterValueView, BorderLayout.WEST);
        JButton incrementButton = new JButton(">");
        add(counterValueView, BorderLayout.EAST);

        setVisible(true);
    }
    public static void main (String[] args){
        new Counter();
    }
}
