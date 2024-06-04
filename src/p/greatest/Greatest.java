package p.greatest;
import java.util.Scanner;
public class Greatest {
    public static int getGreatest(int a,int b,int c)
    {
        int l;
        l = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return l;

    }
        public static void main(String[] args)
        {
            int a, b, c, l;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
            System.out.println("Enter the third number:");
            c = sc.nextInt();
            l = getGreatest(a, b, c);
            System.out.println("The largest number is: "+l);
        }

}
