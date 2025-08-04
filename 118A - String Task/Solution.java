import java.util.Scanner;
public class StringTask 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) 
        {
            if (c != 'a' && c != 'o' && c != 'y' && c != 'e' && c != 'u' && c != 'i') 
            {
                result.append('.');
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
