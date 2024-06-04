package p.inheritence;
import p.getset.Getter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Getter p[] = new Getter[5];
        Scanner scanner = new Scanner(System.in);
        int sem, rno;
        String name, dept;
        for (int i = 0; i < p.length; i++) {

            System.out.println("ENTER AGE,NAME,SEM,ROLLNO AND DEPARTMENT  FOR  STUDENT no. " + (i + 1));
            sem = scanner.nextInt();
            rno = scanner.nextInt();
            name = scanner.next();
            dept = scanner.next();

            p[i] = new Getter();
            p[i].setsem(sem);
            p[i].setrno(rno);
            p[i].setname(name);
            p[i].setdept(dept);
        }
        Person person = new Person();
        person.showstd();
        person.showper();

    }
}
