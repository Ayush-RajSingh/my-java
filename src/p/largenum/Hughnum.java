package p.largenum;

import java.util.Scanner;

public class Hughnum {
    public static void main(String[] args) {
        int n,r,l= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        n = scanner.nextInt();
        while (n > 0)
        {
            {
                r = n % 10;
                if (l < r)
                {
                    l=r;
                }
                n=n/10;
            }
            System.out.println("The largest of the given number is: " + l);
        }
    }
}
