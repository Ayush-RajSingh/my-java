package p.getset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Getter p[] = new Getter[5];
        Scanner scanner = new Scanner(System.in);
        int sem, rno;
        String name, dept,n;
        float per;
        for (int i = 0; i < p.length; i++) {

            System.out.println("ENTER SEM,ROLLNO,NAME,DEPARTMENT,AND PERCENTAGE FOR  STUDENT no. " + (i + 1));
            sem = scanner.nextInt();
            rno = scanner.nextInt();
            name = scanner.next();
            dept = scanner.next();
            per = scanner.nextInt();

            p[i] = new Getter();
            p[i].setsem(sem);
            p[i].setrno(rno);
            p[i].setname(name);
            p[i].setdept(dept);
            p[i].setper(per);
        }
        System.out.println("enter name to search");
        n = scanner.next();
        for (int i = 0; i < p.length; i++) {
           if(n.equals(p[i].getname()))
           {

           }
            
        } 
        

    }
}


