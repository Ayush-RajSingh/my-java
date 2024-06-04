package p.test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.print("Enter any bar code : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String lfd="";
        if(s.length()>4)
        {
             lfd=s.substring(s.length()-4);
        }
        else
        {
            lfd=s;
        }
        System.out.println(lfd);
    }
}