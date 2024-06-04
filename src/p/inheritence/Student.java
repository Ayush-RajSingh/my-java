package p.inheritence;

public class Student {
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void showstd()
    {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
    }
}
