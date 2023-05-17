package javabasic;
import java.util.Arrays;

public class multisingle3
{
    public static void main(String[] args)
    {
        int[][] array = {{12,34,56,78,67}, {12,32,65,89,78}, {99,9,91,24,31},{77,88,98,22,33}};
        int[] single = new int[array.length * 5];

        int row=0,colum=0,index=0;
        for(;colum<=4;colum++,index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        colum--;row++;
        for(;colum>=0;colum--,index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        row++;colum++;
        for (;row<=3;row++,index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        row--;colum++;
        for(;colum<=1;colum++,index++)
        {
            System.out.println(single[index]=array[row][colum]);
        }
        row--;colum--;
        for(;colum<=1;colum++,index++)
        {
            System.out.println(single[index]=array[row][colum]);
        }
        row++;colum++;
        for(;row==2;colum++,index++)
        {
            System.out.println(single[index]=array[row][colum]);
        }
        colum=2;row=2;
        for(;colum<=4;colum++,index++)
        {
            System.out.println(single[index]=array[row][colum]);
        }
        colum=4;row=3;
        for(;colum<=4;colum--,index++)
        {
            System.out.println(single[index]=array[row][colum]);
        }
    }

}
