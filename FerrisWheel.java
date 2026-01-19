// https://cses.fi/problemset/task/1090

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FerrisWheel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] pi = new long[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n ; i++) pi[i] = Long.parseLong(st.nextToken());

        Arrays.sort(pi);

        /*
        Pair the lightest child with the heaviest child

        If they fit together → 1 gondola

        Otherwise → heaviest goes alone
         */

        int l = 0, r = n - 1;
        int gondolas = 0;

        while (l <= r) {
            if (pi[l] + pi[r] <= x) {
                l++;  // pair lightest with heaviest
            }
            r--;      // heaviest always goes
            gondolas++;
        }

        System.out.println(gondolas);
    }
}
