package p.vote;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        n= scanner.nextInt();
        if (n>=21)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("you cant vote ");
            System.out.println("you can vote till"+(n-21)+("years"));
        }
    }
}
