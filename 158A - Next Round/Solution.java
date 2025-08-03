import java.util.Scanner;
public class NextRound 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) 
        {
            scores[i] = sc.nextInt();
        }
        int ks = scores[k - 1]; 
        int Count = 0; 
        for (int i = 0; i < n; i++) 
        {
            if (scores[i]>=ks && scores[i] > 0) 
            {
                Count++;
            }
        }
        System.out.println(Count);
    }
}
