// https://cses.fi/problemset/task/1618

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrailingZeros {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n  = Integer.parseInt(br.readLine());
        int count = 0;
        while(n>0){
            count += n/5;
            n /=5;
        }
        System.out.println(count);
    }
}
