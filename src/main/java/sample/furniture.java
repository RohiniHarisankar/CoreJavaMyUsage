package sample;

import java.util .Scanner;

public class furniture
{
    public static void main(String[] args)
    {
Scanner furniture=new Scanner(System.in);
        System.out.println("which type of dinning table your want");
        String type=furniture.next();
        System.out.println(type+" this type of dinning table  rate is you want");
        double price=furniture.nextDouble();
        System.out.println("currently available or not ...?");
        String reason=furniture.next();

        System.out.println("your choose to type is "+type+"\n your rate is :"+price+" \n currently available or not :"+reason);


    }
}
