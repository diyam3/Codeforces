import java.util.Scanner;

public class Word59A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        if (uppercaseCount > lowercaseCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
