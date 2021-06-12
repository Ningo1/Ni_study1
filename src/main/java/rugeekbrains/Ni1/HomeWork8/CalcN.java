package rugeekbrains.Ni1.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcN extends JFrame {

    public CalcN() {
        setTitle("My First Calc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700,400,600,200);
        Font font = new Font("Arial", Font.BOLD, 24);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        JTextField firstNumber = new JTextField();
        JTextField secondNumber = new JTextField();
        JTextField result = new JTextField();
        JLabel resultLabel = new JLabel("Результат");
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton umnogButton = new JButton("*");
        JButton delenButton = new JButton("/");
        JButton equalButton = new JButton("=");

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(firstNumber.getText());
                double n2 = Double.parseDouble(secondNumber.getText());
                double res = n1 + n2;

             resultLabel.setText(String.valueOf(res));
            }

        });

        plusButton.setFont(font);
        add(plusButton, BorderLayout.EAST);
        minusButton.setFont(font);
        add(minusButton, BorderLayout.EAST);
        umnogButton.setFont(font);
        add(umnogButton, BorderLayout.EAST);
        delenButton.setFont(font);
        add(delenButton, BorderLayout.EAST);

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(firstNumber.getText());
                double n2 = Double.parseDouble(secondNumber.getText());
                double res = n1 - n2;

                resultLabel.setText(String.valueOf(res));
            }

        });
        umnogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(firstNumber.getText());
                double n2 = Double.parseDouble(secondNumber.getText());
                double res = n1 * n2;

                resultLabel.setText(String.valueOf(res));
            }

        });
        delenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(firstNumber.getText());
                double n2 = Double.parseDouble(secondNumber.getText());
                double res = n1 / n2;

                resultLabel.setText(String.valueOf(res));
            }

        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n3 = Double.parseDouble(result.getText());
         //       resultLabel.setText(String.valueOf(n3));
            }

        });
        add(firstNumber);
        add(secondNumber);
        add(equalButton);
        add(resultLabel);

        setVisible(true);
    }
    public static void main(String[] args){
        new CalcN();
    }
}
