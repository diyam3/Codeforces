import java.util.Scanner;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] luckyNumbers = {4, 7, 47, 74, 44, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        boolean isAlmostLucky = false;
        for (int luckyNum : luckyNumbers) {
            if (n % luckyNum == 0) {
                isAlmostLucky = true;
                break; 
            }
        }
        if (isAlmostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
