import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rOne = 0; 
        int cOne = 0; 
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (sc.nextInt() == 1) {
                    rOne = i;
                    cOne = j;
                }
            }
        }
        int moves = Math.abs(rOne - 3) + Math.abs(cOne - 3);
        System.out.println(moves);
        sc.close();
    }
}
