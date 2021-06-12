package rugeekbrains.Ni1.HomeWork8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame{

    public Calc() {
        setTitle("My First Calc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,400,400,100);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        JTextField firstNumber = new JTextField();
        JTextField secondNumber = new JTextField();
        JLabel plusLabel = new JLabel("+");
        JLabel resultLabel = new JLabel();
        JButton equalButton = new JButton("=");

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(firstNumber.getText());
                double n2 = Double.parseDouble(secondNumber.getText());
                double res = n1 + n2;
                resultLabel.setText(String.valueOf(res));
            }

        });

        add(firstNumber);
        add(plusLabel);
        add(secondNumber);
        add(equalButton);
        add(resultLabel);

        setVisible(true);

    }
    public static void main(String[] args){
        new Calc();
    }
}
