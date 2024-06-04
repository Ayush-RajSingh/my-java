package p.getset;

public class Getter {
    private int sem,rno;
    private String name,dept;
    private float per;

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
    public String getname()
    {

        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }
    public String getdept()
    {

        return dept;
    }

    public void setdept(String dept)
    {

        this.dept = dept;
    }
    public float getPer()
    {
        return per;
    }
    public void setper(float per)
    {

        this.per = per;
    }

}

