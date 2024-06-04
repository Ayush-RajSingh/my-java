package p.abstractshape;

public class Circle extends Shape {
    public Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area of circle is " + " " + 3.14 * radius * radius);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle is" + " " + 2 * 3.14 * radius);
    }
}
