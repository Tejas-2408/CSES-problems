// https://cses.fi/problemset/task/1070


import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        if(n==1){
            System.out.println(1);
        }
        else if(1<n && n<4){
            System.out.println("NO SOLUTION");
        }
        else{
            int i = 1;
            int j = 2;
            StringBuilder sb = new StringBuilder();
            while(j<=n){
                sb.append(j).append(" ");
                j+=2;
            }
            while(i<=n){
                sb.append(i).append(" ");
                i+=2;
            }
            System.out.println(sb);

        }

    }
}
