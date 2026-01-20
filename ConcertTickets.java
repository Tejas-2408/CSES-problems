// https://cses.fi/problemset/task/1091

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ConcertTickets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] ticketPrice = new long[n];
        long[] highBid = new long[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) ticketPrice[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++) highBid[i] = Long.parseLong(st.nextToken());

        Arrays.sort(ticketPrice);
    }
}
