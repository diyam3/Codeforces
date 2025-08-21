import java.util.Scanner;
public class PetyaandCountryside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int maxWater = 0;
 
        for (int i = 0; i < n; i++) {
            int currentWater = 1;
 
            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= heights[j - 1]) {
                    currentWater++;
                } else {
                    break;
                }
            }
 
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= heights[j + 1]) {
                    currentWater++;
                } else {
                    break;
                }
            }
 
            if (currentWater > maxWater) {
                maxWater = currentWater;
            }
        }
        
        System.out.println(maxWater);
    }
}
