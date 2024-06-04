package p.rectangle_con;

public class Rectangle {
    private double length,breadth;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double getArea()
    {
        return length*breadth;
    }
    public double getPeri()
    {
        return 2*length*breadth;
    }

}
