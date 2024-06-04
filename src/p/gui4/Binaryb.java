package p.gui4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Binaryb implements ActionListener
{
    JFrame jFrame;
    Font font;
    Font font1;
    JLabel jLabel;
    JRadioButton j1;
    JRadioButton j2;
    JRadioButton j3;
    JRadioButton j4;

    public Binaryb()
    {
        font=new Font("Consolas",Font.BOLD,18);
        font1=new Font("Consolas",Font.BOLD,34);


        jFrame=new JFrame();
        jFrame.setBounds(50,50,600,900);
        jFrame.setTitle("Binary Brains");
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.black);

        jLabel=new JLabel();
        jLabel.setText("Welcome to Binary Brains NAGPUR");
        jLabel.setBounds(50,50,600,50);
        jLabel.setFont(font1);
        Color color=Color.white;
        jLabel.setForeground (color);

        j1=new JRadioButton();
        j1.setFont(font);
        j1.setText("Red");
        j1.setBounds(20,100,60,40);
        Color color1=Color.RED;
        j1.setBackground(color1);

        j2=new JRadioButton();
        j2.setFont(font);
        j2.setText("Blue");
        j2.setBounds(20,150,90,40);
        Color color2=Color.blue;
        j2.setBackground(color2);

        j3=new JRadioButton();
        j3.setFont(font);
        j3.setText("Green");
        j3.setBounds(20,200,90,40);
        Color color3=Color.green;
        j3.setBackground(color3);

        j4=new JRadioButton();
        j4.setFont(font);
        j4.setText("yellow");
        j4.setBounds(20,250,90,40);
        Color color4=Color.YELLOW;
        j4.setBackground(color4);


        jFrame.add(jLabel);
        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(j3);
        jFrame.add(j4);

        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        j4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==j1)
        {
            jLabel.setForeground(Color.red);
        }
        else if (e.getSource()==j2)
        {
            jLabel.setForeground(Color.blue);
        }
        else if (e.getSource()==j3)
        {
            jLabel.setForeground(Color.green);
        }
        else if (e.getSource()==j4)
        {
            jLabel.setForeground(Color.yellow);
        }

    }
}

