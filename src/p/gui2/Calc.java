package p.gui2;
import javax.swing.*;
import java.awt.*;
public class Calc {
    JFrame jFrame;
    JButton j1;
    JButton j2;
    JButton j3;
    JButton j4;
    JButton j5;
    JTextField f1;
    JTextField f2;
    JTextField f3;

    public Calc()
    {
        Font font=new Font("Consolas",Font.BOLD,24);
        jFrame=new JFrame();
        jFrame.setBounds(50,50,600,700);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setTitle("Binary Brains Calci");
        jFrame.getContentPane().setBackground(Color.black);

        f1=new JTextField();
        f1.setBounds(30,30,100,40);
        f1.setFont(font);

        f2=new JTextField();
        f2.setBounds(140,30,100,40);
        f2.setFont(font);

        f3=new JTextField();
        f3.setBounds(250,30,100,40);
        f3.setFont(font);

        j1=new JButton();
        j1.setBounds(30,110,80,30);
        j1.setText("+");
        j1.setFont(font);
        Color color= Color.orange;
        j1.setBackground(color);

        j2=new JButton();
        j2.setBounds(140,110,80,30);
        j2.setText("-");
        j2.setFont(font);
        Color color1= Color.orange;
        j2.setBackground(color1);

        j3=new JButton();
        j3.setBounds(250,110,80,30);
        j3.setText("*");
        j3.setFont(font);
        Color color2= Color.orange;
        j3.setBackground(color2);

        j4=new JButton();
        j4.setBounds(30,180,80,30);
        j4.setText("/");
        j4.setFont(font);
        Color color3= Color.orange;
        j4.setBackground(color3);

        j5=new JButton();
        j5.setBounds(140,180,150,30);
        j5.setText("Clear");
        j5.setFont(font);
        Color color4= Color.orange;
        j5.setBackground(color4);



        jFrame.add(f1);
        jFrame.add(f2);
        jFrame.add(f3);
        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(j3);
        jFrame.add(j4);
        jFrame.add(j5);

    }
}


