package funtamaltaljava.array.consolapplication;

import java.util.Scanner;

public class executionbikecustemerdetail implements bikecustomerdetails {
    bikedetails[] customerdetails = new bikedetails[5];

    public executionbikecustemerdetail() //
    {
        customerdetails[0] = new bikedetails("Rohini", 86767, 65654655567575l, "NamakkAL", 89.67f);
    }

    public static void main(String[] args) {
        executionbikecustemerdetail execution = new executionbikecustemerdetail();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("which  performance you want work this\n1.customername\n 2.listallcustomerdetail\n3.updatecustomerdetail\n4.deletecustomerdetail\n5sortingcustomerdetail");
            String model = scan.next();
            switch (model)
            {
                case "1":
                    System.out.println("adding new customer details(customername,bikenumber,mobilenumber,address,amount)");
                    bikedetails customer1 = new bikedetails(scan.next(), scan.nextInt(), scan.nextLong(), scan.next(), scan.nextFloat());
                    execution.addcustomerdetail(customer1);
                    break;
                case "2":
                    System.out.println("list all value");
                    execution.listallcustomerdetail();
                    break;
                case "3":
                    System.out.println("customer detail update");
                    String name = scan.next();
                    execution.updatecustomerdetail(name);
                    break;
                case "4":
                    System.out.println("which name you want to delete");
                    String name1 = scan.next();
                    execution.deletecustomerdetail(name1);
                    break;
                case "5":
              execution.sortingcustomerdetail();
              execution.listallcustomerdetail();
              break;


            }
        }
        while (true);
    }

    @Override
    public String addcustomerdetail(bikedetails bike) {
        for (int pos = 0; pos < customerdetails.length; pos++) {
            if (customerdetails[pos] == null) {
                customerdetails[pos] = bike;
                System.out.println(bike.getCustomername() + "has been addded");
                break;
            }
        }
        return bike.getCustomername() + "has not been added";
    }

    @Override
    public void listallcustomerdetail() {
        for (bikedetails bike : customerdetails)
            System.out.println(bike);
    }

    @Override
    public String updatecustomerdetail(String customername)
    {
        Scanner Scan = new Scanner(System.in);
        for (int index = 0; index < customerdetails.length; index++)
        {
            if (customerdetails[index].getCustomername().equalsIgnoreCase(customername)) ;
            {
                System.out.println(customerdetails[index]);
                System.out.println("which file you want update");
                String usage = Scan.next();
                switch (usage)
                {
                    case "customername":
                        System.out.println("which customer name you update");
                        String newname = Scan.next();
                        customerdetails[index].setCustomername(newname);
                        return customerdetails[index].getCustomername() + "new name has been added";
                    case "price":
                        System.out.println("which price of package you choose");
                        float newprice = Scan.nextFloat();
                        customerdetails[index].setAmount(newprice);
                        return customerdetails[index].getAmount() + "NEW PRICE has been changed";

                }
            }
        }
        return customername;

    }

    @Override
    public String deletecustomerdetail(String customername)
    {
        for ()
        return null;
    }

    @Override
    public void sortingcustomerdetail()

    {
        return ;
    }

}