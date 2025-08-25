import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        if (n == 0) {
            System.out.println(0); 
            return;
        }
        int groups = 1; 
        String prevMagnet = br.readLine(); 
        for (int i = 1; i < n; i++) {
            String currentMagnet = br.readLine();
            if (prevMagnet.charAt(1) == currentMagnet.charAt(0)) {
                groups++;
            }
            prevMagnet = currentMagnet; 
        }
        System.out.println(groups);
    }
}
