package variabletybe;

public class Local
{
    public static void main(String[] args)
    {
       Local obj=new Local();
        obj.sample1();
       obj.sample2();
       obj.sample3();
       obj.sample4();
       obj.sample5();
       obj.sample6();
       obj.samble7();


    }
    public void sample1()
    {
        String myname = "rohini";
        System.out.println("my name is"+myname);
        }
        public void sample2()
        {
            int calculation=9500;
            System.out.println("my salary is"+calculation);

    }
    public void sample3()
    {
        double balance=5000.0;
        System.out.println("my bank balance is"+balance);
    }
    public void sample4()
    {
        float percentage=68f;
        System.out.println("my bank civil score is"+percentage);

    }
public void sample5()
{
    char grade='a';
    System.out.println("my grade is"+grade);

}
public void sample6()
{
    int a=1992;
    double b=a;
    System.out.println("my birth year is"+b);

}
public void samble7()
{
    long moblieno=9877564453l;
    double convert=(double)moblieno;
    System.out.println("converted value is"+convert);
}
}
