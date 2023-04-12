package sample;

import java.util.Scanner;

public class chair
{
    public static void main(String[] args)
    {
      chair yy=new chair();
      yy.sample();

    }
    public void sample()
    {
        Scanner yy=new Scanner(System.in);
        System.out.println("what is your height?");
        float height=yy.nextFloat();
        double value=(double)height;
        System.out.println();
        System.out.println("my height is"+height+"converted value is"+value);
    }
}
