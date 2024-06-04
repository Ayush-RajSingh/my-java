package p.season;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any month no.");
        n = scanner.nextInt();
        if (n <= 3 && n >= 5)
        {
            System.out.println("season is spring");
        } else if (n <= 6 && n >= 7)
        {
            System.out.println("season is summer");
        } else if (n <= 9 && n >= 11)
        {
            System.out.println("season is winter");
        } else if (n <= 12 || n >= 2)
        {
            System.out.println("season is autumn");
        } else {
            System.out.println("pls enter valid input");
        }
    }
}

