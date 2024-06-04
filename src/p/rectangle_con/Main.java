package p.rectangle_con;
import java.util.Scanner;
class Program {
    public static void main(String[] args) {
        double length, breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth :");
        length=scanner.nextInt();
        breadth=scanner.nextInt();
        Rectangle r=new Rectangle(length,breadth);
        double area=r.getArea();
        double peri=r.getPeri();
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + peri);
    }
}
