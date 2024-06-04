package p.composition;

public class Author {
    private int age;
    private String name1,country,gender;
    private Book objbook;

    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    public String getname1() {
        return name1;
    }
    public void setname1(String name1) {
        this.name1 = name1;
    }
    public String getcountry() {
        return country;
    }
    public void setcountry(String country) {
        this.country = country;
    }
    public String getgender() {
        return gender;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
}
