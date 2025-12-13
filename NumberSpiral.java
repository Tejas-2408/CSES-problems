// https://cses.fi/problemset/task/1071

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            if(x>=y){
                if(x%2==1){
                    System.out.println(x*x-y+1);
                }
                else{
                    x=x-1;
                    System.out.println(x*x+y);
                }
            }
            else{
                if(y%2==0){
                    System.out.println(y*y+1-x);
                }
                else{
                    y = y-1;
                    System.out.println(y*y+x);
                }
            }
        }
    }
}
