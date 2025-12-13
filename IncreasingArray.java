// https://cses.fi/problemset/task/1094


import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        long[] arr = new long[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i] = Long.parseLong(parts[i]);
        }

        long step = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                step += arr[i-1]-arr[i];
                arr[i] = arr[i-1];
            }
        }

        System.out.println(step);
    }
}
