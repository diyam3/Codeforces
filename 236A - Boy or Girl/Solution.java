import java.util.Scanner;
import java.util.ArrayList;
public class BoyorGirl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=str.length();
        char[] charArray = str.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        char ch;
        int s=0;
        for(int i=0; i<l; i++)
        {
            ch=str.charAt(i);
            if(list.contains(ch))
            continue;
            else if (!list.contains(ch))
            {
               s++;
               list.add(ch);
            }
        }
        if(s%2==0)
        System.out.println("CHAT WITH HER!");
        else if(s%2!=0)
        System.out.println("IGNORE HIM!");
    }
}
