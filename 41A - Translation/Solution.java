import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s = reader.next(); // Read the first word
        String t = reader.next(); // Read the second word
        reader.close();

        // Reverse the first string 's'
        StringBuilder reversedS = new StringBuilder(s);
        reversedS.reverse();
        String sReversed = reversedS.toString();

        // Compare the reversed string with 't'
        if (t.equals(sReversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
