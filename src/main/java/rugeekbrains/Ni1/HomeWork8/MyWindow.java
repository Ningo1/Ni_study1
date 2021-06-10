package rugeekbrains.Ni1.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("My First UI App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,400,400,400);


   //     JButton jButton = new JButton("First button");
   //     add(new JButton("First button"), BorderLayout.NORTH);
   //     add(new JButton("Second button"),BorderLayout.SOUTH);
   //     add(new JButton("3th button"),BorderLayout.CENTER);
   //     add(new JButton("4th button"),BorderLayout.EAST);
   //     add(new JButton("5th button"),BorderLayout.WEST);

    //    setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
   //     for (int i=0; i<5; i++){
   //         add(new JButton("#" +i));
    //    }

   //     setLayout(new FlowLayout());
   //     for (int i=0; i<7; i++){
   //         add(new JButton("#" +i));
   //     }

    // Самая лучшая
   //     setLayout(new GridLayout(3,3));
   //     for (int i=0; i<9; i++){
   //         add(new JButton("#" +i));
   //    }

        setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(140,20,200,40);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        add(textField);

        JButton button = new JButton("button 1");
        button.setBounds(10,20,100,40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                textField.setText("Случайное число  " + random.nextInt());
            }
        });

        add(button);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается!");

           }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        new MyWindow();

    }
}
