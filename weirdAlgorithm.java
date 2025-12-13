// https://cses.fi/problemset/task/1068

import java.math.BigInteger;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class weirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine());
        while(n>1){
            System.out.print(n+" ");
            n = n%2==0 ? n/2 : (n*3)+1;
        }
        System.out.println(n);
    }
}