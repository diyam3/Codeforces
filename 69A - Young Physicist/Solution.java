import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String line = br.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = br.readLine();
        }
        if (line == null) return;
        n = Integer.parseInt(line.trim());
        long sumX = 0;
        long sumY = 0;
        long sumZ = 0;
        for (int i = 0; i < n; i++) {
            String vecLine = br.readLine();
            while (vecLine != null && vecLine.trim().isEmpty()) {
                vecLine = br.readLine();
            }
            if (vecLine == null) break;
            StringTokenizer st = new StringTokenizer(vecLine);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
