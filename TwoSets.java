// https://cses.fi/problemset/task/1092/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class TwoSets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long totalSum = (long) n * (n + 1) / 2;

        if (totalSum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

        long target = totalSum / 2;
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            if (i <= target) {
                set1.add(i);
                target -= i;
            } else {
                set2.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(set1.size()).append('\n');
        for (int x : set1) sb.append(x).append(' ');
        sb.append('\n');

        sb.append(set2.size()).append('\n');
        for (int x : set2) sb.append(x).append(' ');

        System.out.println(sb);
    }
}
