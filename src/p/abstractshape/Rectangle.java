package p.abstractshape;

    public class Rectangle extends Shape{
        public Rectangle(double l,double b){
            length=l;
            breadth=b;
        }
        @Override
        public void area()
        {
            System.out.println("Area of rectangle is"+" "+length*breadth);
        }
        @Override
        public void perimeter()
        {
            System.out.println("Perimeter of reactangle is"+" "+2*(length+breadth));
        }
    }

