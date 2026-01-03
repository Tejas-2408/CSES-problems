// https://cses.fi/problemset/task/1072

import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            boolean[][] arr = new boolean[i][i];
//            System.out.println(knightPlace(arr,0,0,2));
//        }

        for (int i = 1; i <= n; i++) {
            System.out.println(countWays(i));
        }
    }

    // Solution by permutations and combinations
    // total ways of placing two knights - total attacking ways
    static long countWays(int n){
        long total_cells = n*n;
        if(n==1){
            return 0;
        }

        // total knight placement
        long totalPermutation = total_cells * (total_cells-1)/2;

        // total attacking ways in 2x3 and 3x2 colums
        long attacking_ways = 2L * (n-1) * (n-2) * 2;

        return totalPermutation - attacking_ways;
    }

    static int knightPlace(boolean[][] arr,int row, int col, int k){
        if(k==0){
            return 1;
        }

        int count = 0;

        if(row == arr.length-1 && col == arr.length){
            return 0;
        }

        if(col == arr.length){
            count += knightPlace(arr,row+1,0,k);
            return count;
        }

        if(isSafe(arr,row,col)){
            arr[row][col] = true;
            count += knightPlace(arr,row,col+1,k-1);
            arr[row][col] = false;
        }

        count += knightPlace(arr,row,col+1,k);

        return count;
    }

    static boolean isSafe(boolean[][] arr, int row, int col){
        if(isValid(arr,row-2,col-1)){
            if(arr[row-2][col-1]){
                return false;
            }
        }

        if(isValid(arr,row-2,col+1)){
            if(arr[row-2][col+1]){
                return false;
            }
        }

        if(isValid(arr,row-1,col-2)){
            if(arr[row-1][col-2]){
                return false;
            }
        }

        if(isValid(arr,row-1,col+2)){
            if(arr[row-1][col+2]){
                return false;
            }
        }

        return true;

    }

    static boolean isValid(boolean[][] arr, int row, int col){
        if (row >= 0 && row < arr.length && col >= 0 && col < arr.length){
            return true;
        }
        return false;
    }
}
