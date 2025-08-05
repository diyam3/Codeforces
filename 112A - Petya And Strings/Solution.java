import java.util.Scanner;
public class PetyaAndStrings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String fs = sc.next();
        String ss = sc.next();
        String lf = fs.toLowerCase();
        String ls = ss.toLowerCase();
        int res = lf.compareTo(ls);
 
        if (res == 0) {
            System.out.println("0");
        } 
        else if (res > 0) {
            System.out.println("1");
        } 
        else { 
            System.out.println("-1");
        }
    }
}
