// https://cses.fi/problemset/task/3399

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RaabGame1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a+b > n){
                System.out.println("NO");
                continue;
            }

            int[] p1 = new int[n];
            int[] p2 = new int[n];

            // Player 1 uses largest a cards to beat smallest
            List<Integer> p1Wins = new ArrayList<>();
            List<Integer> p2Wins = new ArrayList<>();
            for (int i = 0; i < a; i++) p1Wins.add(n - i);
            for (int i = 0; i < b; i++) p2Wins.add(1 + i);

            Set<Integer> used = new HashSet<>();
            used.addAll(p1Wins);
            used.addAll(p2Wins);

            List<Integer> rest = new ArrayList<>();
            for (int i = 1; i <= n; i++) if (!used.contains(i)) rest.add(i);

            for (int i = 0; i < a; i++) {
                p1[i] = p1Wins.get(i);
                p2[i] = rest.get(rest.size() - 1 - i);
            }

            for (int i = 0; i < b; i++) {
                p1[a + i] = rest.get(i);
                p2[a + i] = p2Wins.get(i);
            }

            int idx = a + b;
            int j = b;
            while (idx < n) {
                p1[idx] = rest.get(j);
                p2[idx] = rest.get(rest.size() - 1 - j);
                idx++;
                j++;
            }

            System.out.println("YES");
            for (int i = 0; i < n; i++) System.out.print(p1[i] + " ");
            System.out.println();
            for (int i = 0; i < n; i++) System.out.print(p2[i] + " ");
            System.out.println();
        }
    }
}
