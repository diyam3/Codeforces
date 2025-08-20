import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        double sumOfPercentages = 0;
        for (int i = 0; i < n; i++) {
            int percentage = sc.nextInt(); 
            sumOfPercentages += percentage;
        }
        double averagePercentage = sumOfPercentages / n;
        System.out.println(String.format("%.12f", averagePercentage));
    }
}
