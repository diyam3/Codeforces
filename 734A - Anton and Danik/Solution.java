import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String s = sc.next(); 
        int a = 0;
        int d = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                a++;
            } else if (c == 'D') {
                d++;
            }
        }
        if (a > d) {
            System.out.println("Anton");
        } else if (d > a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
