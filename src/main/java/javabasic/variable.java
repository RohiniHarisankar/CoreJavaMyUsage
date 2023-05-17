package javabasic;

public class variable
{
    public static void main(String[] args)
    {
        long mobile=9500389122l;//iv
        System.out.println("my mobile no is"+mobile);
        variable obj=new variable();
        obj.lv();
        st();


    }
    public void lv()
    {
        String name="Rohini";
        System.out.println("my name "+name);
        System.out.println("my account no is "+accno);

    }
    long accno=636363636l;
    public static void st()
    {
        System.out.println("happy birthday");

    }
    static
    {
        System.out.println("welcome");
    }
}
