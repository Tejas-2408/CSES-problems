// https://cses.fi/problemset/task/1617


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitStrings {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long result = 1;

        for (int i = 0; i < n; i++) {
            result = (result * 2) % MOD;
        }

        System.out.println(result);
    }
}
