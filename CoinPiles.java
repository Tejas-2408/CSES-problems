// https://cses.fi/problemset/task/1754

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            sb.append( (a+b)%3 == 0 && Math.min(a, b) * 2 >= Math.max(a, b) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}
