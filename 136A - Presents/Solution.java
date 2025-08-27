import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        int[] result = new int[n]; 
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
        for (int i = 0; i < n; i++) {
            int receiver = Integer.parseInt(st.nextToken()); 
            result[receiver - 1] = i + 1; 
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + (i == n - 1 ? "" : " ")); 
        }
        System.out.println(); 
    }
}
