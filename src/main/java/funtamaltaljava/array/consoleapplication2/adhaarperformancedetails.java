package funtamaltaljava.array.consoleapplication2;
import java.util.Arrays;
import java.util.Scanner;

public class adhaarperformancedetails implements ahaarcustomerdetails {
    adhaardetails[] customer = new adhaardetails[8];

    public adhaarperformancedetails() {
        customer[0] = new adhaardetails("Arul", "arul", 1960, 8973856090l, 35798452148976l, 50f);
        customer[1] = new adhaardetails("arul", "selvi", 1965, 9658255546l, 211545621545l, 55f);
        customer[2] = new adhaardetails("arul", "rohini", 1992, 9500389122l, 156525653263l, 52f);
        customer[3] = new adhaardetails("arul", "gokul", 1994, 9521452130l, 12365478991l, 51f);
    }

    public static void main(String[] args)
    {
        adhaarperformancedetails obj = new adhaarperformancedetails();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("which name of adhaar you want");
            String name = scan.next();
                switch (name)
                {
                    case "1":
                        System.out.println("adding new customer details\n1" + "customername\n2" + "listallcustomerdetail\n3" + "updatecustomerdetail\n4" + "deletecustomerdetail\n5" + "sortingcustomerdetails");

                    default:
                        System.out.println();
                }
            }
        while (true);
    }


    @Override
    public String addcustomerdetails()
    {


        return null;
    }

    @Override
    public void listallcustomerdetails() {

    }

    @Override
    public String Updatecustomerdetails() {
        return null;
    }

    @Override
    public String deletecustomerdetails() {
        return null;
    }

    @Override
    public float sortingcustomerdetails() {
        return 0;
    }
}
