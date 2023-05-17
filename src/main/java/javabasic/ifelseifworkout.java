package javabasic;

public class ifelseifworkout {
    public static void main(String[] args) {
        int tamil = 90;
        int eng = 90;
        int mat = 95;
        int sci = 90;
        int total = 265;
        if (total >= 260)
        {
            System.out.println("1st mark");
            if (tamil > 95)
            {
                System.out.println("tamil 1st mark");
            } else if (eng >= 95)
            {
                System.out.println("eng");
            } else if (sci >= 90)
            {
                System.out.println("sci");
            }
            else
            {
                System.out.println("your mark below 250");
            }
        }
        else
        {
            System.out.println("Worthless");
        }
    }
}
