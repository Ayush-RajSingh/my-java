package p.profitloss;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        float cp,sp;
        float a1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter cost price");
        cp= scanner.nextInt();
        System.out.println("enter selling price");
        sp= scanner.nextInt();
        if (sp>cp)
        {
            System.out.println("you earned a profit of "+(sp-cp));
            float pp=sp-cp;
            a1= (float)((pp/cp)*100);

            System.out.println("percentage is "+a1+"%");
        }
        else
        {
            {
                System.out.println("you lost  "+(cp-sp));
            }
        }
    }
}
