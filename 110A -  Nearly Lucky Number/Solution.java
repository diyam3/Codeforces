import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        int luckyDigitCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (digit == '4' || digit == '7') {
                luckyDigitCount++;
            }
        }

        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
