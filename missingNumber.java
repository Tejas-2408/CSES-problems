// https://cses.fi/problemset/task/1083/

import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine());
//        long sum = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).sum();

        String s = sc.nextLine();
        String[] parts = s.split(" ");
        long[] nums = new long[parts.length];

        for(int i=0;i<parts.length;i++){
            nums[i] = Long.parseLong(parts[i]);
        }

        long sum = 0;
        for(long i: nums){
            sum+=i;
        }

        long actualSum = n * (n+1)/2;
        System.out.println(actualSum-sum);
    }
}
