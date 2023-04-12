package sample;

public class GLOBAL
{
    double weight=62;
public void nayasa()
{
    System.out.println("my weight is"+weight);
    int hight=157;
    System.out.println("my hight is"+hight);

}

        public static void main(String[] args)
        {
            GLOBAL bottle=new GLOBAL();
            bottle.hari();
            bottle.nayasa();
        }
        public void hari()
        {
            System.out.println("myweight is"+weight);
        }
    static
    {
        System.out.println("welcome");
    }
    public static void hari1()
    {
        System.out.println("what is your name");
    }
}