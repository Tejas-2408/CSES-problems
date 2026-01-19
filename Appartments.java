// https://cses.fi/problemset/task/1084

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Appartments {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long[] a = new long[n];
        long[] b = new long[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) b[i] = Long.parseLong(st.nextToken());

        Arrays.sort(a);
        Arrays.sort(b);

        /*
        | Condition         | Action                                           |
| ----------------- | ------------------------------------------------ |
| `b[j] < a[i] - k` | Apartment too small → `j++`                      |
| `b[j] > a[i] + k` | Apartment too large → applicant rejected → `i++` |
| Otherwise         | Match found → `count++`, `i++`, `j++`            |

         */

        int i = 0, j = 0, count = 0;

        while (i < n && j < m) {
            if (b[j] < a[i] - k) {
                j++; // apartment too small
            } else if (b[j] > a[i] + k) {
                i++; // apartment too big for this applicant
            } else {
                // match
                count++;
                i++;
                j++;
            }
        }

        System.out.println(count);
    }
}
