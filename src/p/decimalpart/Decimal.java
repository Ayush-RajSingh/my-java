package p.decimalpart;

import java.util.Scanner;

public class Decimal {
        public static float decimal(float num )
        {
            int a = (int)num;
            float d=num-a;
            return d;
        }
        public static void main(String args[])
        {
            float num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any float no.");
            num = sc.nextFloat();
            float d =decimal(num);
            System.out.printf("the decimal of the no  is "+ d );
        }
    }

