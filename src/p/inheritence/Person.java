package p.inheritence;

public class Person extends Student{
    private int sem,rno;
    private String dept;
    public int getsem()
    {
        return sem;
    }
    public void setsem(int sem)
    {
        this.sem = sem;
    }
    public int getrno()
    {
        return rno;
    }
    public void setrno(int rno)
    {
        this.rno = rno;
    }
    public String getdept()
    {

        return dept;
    }
    public void setdept(String dept)
    {

        this.dept = dept;
    }
    public void showper()
    {
        System.out.println("sem is " + sem);
        System.out.println("rno is " + rno);
        System.out.println("dept is " + dept);
    }
}
