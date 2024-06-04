package p.primenum;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n = 1, r, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        n = scanner.nextInt();
        boolean b = true;
        while (n > 0) {
            r = n % 10;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0) {
                    b = false;
                    break;
                }
                if (b == true) {
                    sum = sum + r;
                }
                else{
                    b=true;
                }
                n=n/10;
            }
            System.out.println("the sum of all prime no is "+sum);
        }
    }
}
