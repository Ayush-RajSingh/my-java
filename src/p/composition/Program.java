package p.composition;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.next();
        System.out.println("Enter pages");
        int pages = scan.nextInt();
        System.out.println("Enter price");
        float price = scan.nextInt();
        Book obj = new Book();
        obj.setname(name);
        obj.setpages(pages);
        obj.setprice(price);

        System.out.println("Enter age");
        int age = scan.nextInt();
        System.out.println("Enter author name");
        String name1 = scan.next();
        System.out.println("Enter country name");
        String country = scan.next();
        System.out.println("Enter author gender");
        String gender = scan.next();

        Author objt = new Author();
        objt.setage(age);
        objt.setname1(name1);
        objt.setcountry(country);
        objt.setgender(gender);

    }
}
