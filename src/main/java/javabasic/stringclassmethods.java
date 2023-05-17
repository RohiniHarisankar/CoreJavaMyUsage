package javabasic;

public class stringclassmethods
{
    public static void main(String[] args)
    {
     stringclassmethods cls=new stringclassmethods();
     String user1="rohini";
     String user2="mohan";//literal
     String user3=new String("mohanavel");//non literal

        user3=user3.concat("arul");
        System.out.println(user3);
        System.out.println(user1.charAt(3));
        System.out.println(user2.contains("an"));
        System.out.println(user1.equals("Rohini"));
        System.out.println(user1.equalsIgnoreCase("rohini"));
        String sentance="     i am rohini     ";
        System.out.println(sentance);

    }
}
