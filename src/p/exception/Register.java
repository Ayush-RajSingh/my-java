package p.exception;

import javax.naming.InvalidNameException;
import java.util.Scanner;

/**  public class Register
{
    public static void main(String[] args) {
          //  try{
            int age;
            String name;
            Scanner scanner=new Scanner(System.in);
            System.out.println("ENTER  YOUR AGE:");
            age=scanner.nextInt();
            if(age>=80) {
                throw new InvalidAgeException();
            }else if (age < 18) {
                int a = 18 - age;
                System.out.println("you can vote after" + a + "years");
            }
            System.out.println("ENTER  YOUR NAME:");
                name=scanner.next();
                for(int i=0;i<name.length();i++)
                    if(name.charAt(i)>=0 && name.charAt(i)<=20)
                {
                    throw new InvalidNameException();
                }
            System.out.println("hello"+name+"you can vote");
            }
        }
        catch(InvalidNameException ex)
    {
        System.out.println(ex.getMessage());
    }
        catch(InvalidAgeException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
         */

