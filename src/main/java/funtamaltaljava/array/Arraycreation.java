package funtamaltaljava.array;
import java.util.Arrays;
public class Arraycreation
{
    public static void main(String[] args)
    {
      arrayctn();

    }
    public static void arrayctn()
    {
       String[]iplteamname={"csk","mi","rcb","kkr","rr","lsg","punjab"};
        System.out.println(Arrays.toString(iplteamname));
        for(int index=0;index<iplteamname.length;index++)
        {
            System.out.println(iplteamname[index]);
        }
        for(String team:iplteamname)
        {
            System.out.println(team);
        }
    }

}
