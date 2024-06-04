package p.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a ,b ,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1 and num 2");
        a = scanner.nextInt();
        b = scanner.nextInt();
        Calculator calculator =new Calculator();
        calculator.set(a,b);
        c=calculator.add();
        d=calculator.subtract();
        System.out.println("the sum is: "+c);
        System.out.println("the sub is: "+d);



    }
}
