package sample;

import java.util.Scanner;

public class scannerclass
{
    public static void main(String[] args)
    {
        Scanner yy=new Scanner(System.in);
        System.out.println("what is your name?");
        String name=yy.next();
        System.out.println("my percentage is");
        float percentage=yy.nextFloat();
        System.out.println("what is your mobile no?");
        long no=yy.nextLong();
        System.out.println("born year");
        int year=yy.nextInt();
        System.out.println("salary percentage");
        double pt=yy.nextDouble();



        }

    }

