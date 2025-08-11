import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of statements
        int x = 0; // Initial value of x
 
        for (int i = 0; i < n; i++) {
            String statement = sc.next(); // Read each statement
            if (statement.charAt(1) == '+') { // Check the character at index 1
                x++; // Increment x if it's '+'
            } else {
                x--; // Decrement x if it's '-'
            }
        }
        System.out.println(x); // Print the final value of x
        sc.close();
    }
}
