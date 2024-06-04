package p.factorial;
import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbers ");
        int number = scanner.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of  is: "+fact);
    }
} 