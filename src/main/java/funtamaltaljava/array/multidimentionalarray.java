package funtamaltaljava.array;
import java.util.Arrays;
public class multidimentionalarray
{
    public static void main(String[] args)
    {
        int[][] number1 = {{45, 55, 65}, {75, 15, 25}, {35, 95, 85}};

        System.out.println(number1.length);
        //for (int row = 0; row < 3; row++)
      //  {
         //   for (int colum = 0; colum <= 2; colum++)
           // {
             //   System.out.print(number1[row][colum]+" ");
            //}
            for(int[]num:number1)
            {
             System.out.println(Arrays.toString(num));
            }
        }
    }
