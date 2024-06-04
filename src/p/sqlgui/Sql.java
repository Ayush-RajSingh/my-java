package p.sqlgui;
import javax.swing.*;
import java.awt.*;

public class Sql {
    JFrame jFrame;
    JLabel j1;
    JTextField f1;
    JLabel j2;
    JTextField f2;
    JLabel j3;
    JTextField f3;
    JLabel j4;
    JTextField f4;
    JButton jButton;
    Font font;

    public Sql()
    {
        font=new Font("Consolas",Font.BOLD,18);
        jFrame=new JFrame();
        jFrame.setBounds(50,50,600,900);
        jFrame.setTitle("Binary Brains");
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        j1=new JLabel();
        j1.setText("Roll No");
        j1.setBounds(50,20,600,50);
        j1.setFont(font);
        Color color =Color.black ;
        j1.setForeground(color);

        f1=new JTextField();
        f1.setBounds(150,20,250,40);
        f1.setFont(font);

        j2=new JLabel();
        j2.setText("Name");
        j2.setBounds(50,80,600,50);
        j2.setFont(font);
        Color color1 =Color.black ;
        j2.setForeground(color1);

        f2=new JTextField();
        f2.setBounds(150,80,250,40);
        f2.setFont(font);


        j3=new JLabel();
        j3.setText("Course");
        j3.setBounds(50,140,600,50);
        j3.setFont(font);
        Color color2 =Color.black;
        j3.setForeground(color2);

        f3=new JTextField();
        f3.setBounds(150,140,250,40);
        f3.setFont(font);


        j4=new JLabel();
        j4.setText("Fees");
        j4.setBounds(50,200,600,50);
        j4.setFont(font);
        Color color3 =Color.black;
        j4.setForeground(color3);

        f4=new JTextField();
        f4.setBounds(150,200,250,40);
        f4.setFont(font);

        jButton=new JButton();
        jButton.setText("Get");
        jButton.setFont(font);
        jButton.setBounds(100,280,100,40);

        jFrame.add(j1);
        jFrame.add(f1);
        jFrame.add(j2);
        jFrame.add(f2);
        jFrame.add(j3);
        jFrame.add(f3);
        jFrame.add(j4);
        jFrame.add(f4);
        jFrame.add(jButton);
    }
}
