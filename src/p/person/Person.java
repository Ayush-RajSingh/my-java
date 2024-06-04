package p.person;

import java.util.Scanner;

public class Person {
    public static String getfullname(String fname ,String mname ,String lname)
    {
        String a=fname+""+mname+""+lname;
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String f= sc.next();
        System.out.println("Enter middle name");
        String m= sc.next();
        System.out.println("Enter last name");
        String l= sc.next();
        String a=getfullname(f,m,l);
        System.out.println(a);
    }
}
