import java.util.Scanner;
 
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
 
        long totalCost = 0; 
        for (int i = 1; i <= w; i++) {
            totalCost += (long) i * k; 
        }
        long amountToBorrow = 0;
        if (totalCost > n) {
            amountToBorrow = totalCost - n;
        }
        System.out.println(amountToBorrow);
    }
}
