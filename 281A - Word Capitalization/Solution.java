import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] arr = word.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println(); 
    }
}
