import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int firstScore = sc.nextInt();
        int minScore = firstScore;
        int maxScore = firstScore;
        int amazingPerformances = 0;

        for (int i = 1; i < n; i++) {
            int currentScore = sc.nextInt();
            if (currentScore > maxScore) {
                amazingPerformances++;
                maxScore = currentScore;
            } else if (currentScore < minScore) {
                amazingPerformances++;
                minScore = currentScore;
            }
        }
        System.out.println(amazingPerformances);
        sc.close();
    }
}
