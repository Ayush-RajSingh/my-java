package p.opprect;

import java.io.InputStream;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    public void read()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length and breadth ");
        length = scanner.nextInt();
        breadth = scanner.nextInt();
    }
    public void area()
    {
        double area;
        area=length*breadth;
        System.out.println("area is " + area);
    }
    public void perimeter()
    {
        double peri;
        peri=2*(length+breadth);
        System.out.println("perimeter is " + peri);
    }
}
