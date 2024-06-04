package p.reverse;
import java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        int n , r=0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        n = scanner.nextInt();
        while(n != 0)
        {
            {
                int remainder = n % 10;
                r = r * 10 + remainder;
                n = n/10;
            }
            System.out.println("The reverse of the given number is: " + r);
        }
    }
}
