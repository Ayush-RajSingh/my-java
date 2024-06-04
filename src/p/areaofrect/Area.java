package p.areaofrect;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        int l, b, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        l = scanner.nextInt();
        System.out.println("enter breadth");
        b = scanner.nextInt();
        area = l * b;
        System.out.println("area of rectangle is" + area);
    }
}
