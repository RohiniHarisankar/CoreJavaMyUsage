package variabletybe;

public class ifelsestatemant
{
    public static void main(String[] args)
    {
int age=30;
        if (1 <=16)
        {
            age = 16;
            System.out.println("your are studing shcool person");

            if (18 < 25)
            {
                age = 20;
                System.out.println("your are studing collage person");
            }
             else if (20 < 30)
            {
                int age1 = 25;
                System.out.println("your are working person");
            }
            else
            {
                System.out.println("your are studing collage person");
            }
        }
        else
        {
            System.out.println("y r child");
        }
    }
}

