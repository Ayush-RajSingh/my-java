package p.gui;
import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    JButton jButton;
    JButton j;

    Font font;

    public Gui()
    {
        font=new Font("Consolas",Font.BOLD,18);

        jFrame=new JFrame();
        jFrame.setBounds(50,50,600,300);
        jFrame.setTitle("Binary Brains");
        jFrame.setLayout(null);
        jFrame.setVisible(true);


        jLabel=new JLabel();
        jLabel.setText("enter name");
        jLabel.setBounds(20,20,250,40);
        jLabel.setFont(font);
        Color color =Color.black ;
        jLabel.setForeground(color);

        jButton= new JButton();
        jButton.setText("ok");
        jButton.setBounds(50,80,80,30);
        jButton.setFont(font);
        Color color1 = Color.black;
        jButton.setBackground(color1);

        jTextField=new JTextField();
        jTextField.setBounds(290,20,250,40);
        jTextField.setFont(font);

        j=new JButton();
        j.setText("Cancel");
        j.setBounds(300,80,120,30);
        j.setFont(font);
        Color color2 = Color.black;
        j.setBackground(color2);


        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jTextField);
        jFrame.add(j);
    }
}

