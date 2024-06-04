package p.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String []sarr=s.split("\\,");
        char firstletter = sarr[0].toLowerCase().charAt(0);
        boolean flag = true;

        for(int i = 1; i<sarr.length;i++)
        {
            if(sarr[i].toLowerCase().charAt(0) != firstletter)
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            StringBuilder sb = new StringBuilder(sarr[0]);
            System.out.println(sb.reverse() + sarr[sarr.length - 1]);
        }
        else
        {
            StringBuilder sb = new StringBuilder(sarr[sarr.length - 1]);
            System.out.println(sb.reverse() + sarr[0] );
        }
    }
}
