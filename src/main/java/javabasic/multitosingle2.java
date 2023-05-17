package javabasic;
import java.util.Arrays;

public class multitosingle2
{
    public static void main(String[] args) {
        int[][] array = {{51, 52, 53, 54}, {21, 42, 63, 84}, {11, 22, 33, 44}};
        int[] single = new int[array.length * 4];

        int row = 0, colum = 3, index = 0;
        for (; row <= 2; row++, index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        row = 2;colum--;
        for (; colum >= 0; colum--, index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        row--;colum++;
        for (; row >= 0; row--, index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        colum++;row++;
        for (;colum<=2;colum++,index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
        colum--;row++;
        for(;colum<=2;colum--,index++)
        {
            System.out.println(single[index] = array[row][colum]);
        }
    }
}
