package p.abstractshape;
    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            double r,l  ,b;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter radius of circle ");
            r= scanner.nextDouble();
            System.out.println("enter length and breadth");
            l= scanner.nextDouble();
            b= scanner.nextDouble();
            Circle c= new Circle(r);
            c.area();
            c.perimeter();
            Rectangle rect=new Rectangle(l,b);
            rect.area();
            rect.perimeter();

        }
    }