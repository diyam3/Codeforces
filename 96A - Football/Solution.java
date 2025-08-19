import java.util.Scanner;
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean dangerous = false;
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentPlayer = s.charAt(i);
            if (currentPlayer == '0') {
                countZero++;
                countOne = 0; 
            } else { 
                countOne++;
                countZero = 0;
            }
            if (countZero >= 7 || countOne >= 7) {
                dangerous = true;
                break; 
            }
        }
        if (dangerous) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
