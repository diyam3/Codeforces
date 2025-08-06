import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class HelpfulMaths
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        char ch;
        ArrayList<Integer> digits=new ArrayList<>();
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch!='+')
            {
                digits.add(Character.getNumericValue(ch));
            }
        }
        Collections.sort(digits);
        int l1=digits.size();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < l1; i++) {
            result.append(digits.get(i));
            if (i < l1 - 1) {
                result.append("+");
            }
        }
        System.out.println(result.toString());
    }
}
