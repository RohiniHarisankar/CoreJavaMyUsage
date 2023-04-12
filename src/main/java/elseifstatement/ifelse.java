package elseifstatement;

public class ifelse
{
    public static void main(String[] args) {
        int tamilmark = 98;
        int englishmark = 85;
        int mathsmark = 90;
        int scienemark = 86;
        int socialmark = 90;
        int totalmark = 449;


        if (totalmark > 440) {
            System.out.println("maths mark");
            if (tamilmark < 90) {
                System.out.println("tamil");
            } else {
                System.out.println("maths");
            }
        }

    }}