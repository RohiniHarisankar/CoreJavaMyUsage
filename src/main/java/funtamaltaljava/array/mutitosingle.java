package funtamaltaljava.array;
import java.util.Arrays;

public class mutitosingle
{
    public static void main(String[] args)
    {
        int[][] array = {{21, 51, 41}, {31, 11, 51}, {41, 31, 21}};
        int[] single = new int[array.length * 3];

        int row = 1,colum = 1,index=0;
        for (;colum <= 2; colum++,index++)
        {
            System.out.println(single[index]= array[row][colum]);
        }
        colum--;row=2;
            for(;row<=2;colum--,index++)
        {
            System.out.println(single[index]= array[row][colum]);
        }
        row--;colum--;
            for(;colum>=0;row--,index++)
        {
            System.out.println(single[index]= array[row][colum]);
        }
        row=0;colum++;
        for(;colum>=2;colum++,index++)
        {
            System.out.println(single[index]= array[row][colum]);
        }
    }

}
