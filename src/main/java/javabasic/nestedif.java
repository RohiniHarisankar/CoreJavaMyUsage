package javabasic;

public class nestedif
{
    public static void main(String[] args)
    {
        int tamil=95;
        int eng=80;
        int mat=95;
        int total=270;

        if(total>250)
        {
            System.out.println("mark1");
            if (tamil>90) {
                System.out.println("tamil group");
            }
           else
           {
            System.out.println("not eligible for tamil group");
           }}
        else
        {
            System.out.println("u r eligible for arts");
        }

    }
}
