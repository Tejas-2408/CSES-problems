// https://cses.fi/problemset/task/1755

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        /*
        A palindrome can be formed if:

        At most one character has an odd count

        All other characters appear an even number of times
         */

        // check for the freq of each character
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
        }

        // check for odd frequency
        int oddIndex = -1;
        int oddCount = 0;

        for(int i = 0; i < freq.length ; i++){
            if(freq[i] % 2 == 1){
                oddIndex = i;
                oddCount++;
            }
        }

        // If more than one odd, no palindrome
        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        /*
        Build the Palindrome

        Build the first half by putting count/2 of each character.

        Put the odd-count character in the middle (if one exists).

        Mirror the first half to form the second half.
         */

        StringBuilder half = new StringBuilder();

        // Build first half
        for (int i = 0; i < 26; i++) {
            int count = freq[i] / 2;
            for (int j = 0; j < count; j++) {
                half.append((char) (i + 'A'));
            }
        }

        // Middle part if odd
        StringBuilder middle = new StringBuilder();
        if (oddIndex != -1) {
            for (int j = 0; j < freq[oddIndex] % 2; j++) {
                middle.append((char) (oddIndex + 'A'));
            }
        }

        StringBuilder secondHalf = new StringBuilder(half).reverse();
        System.out.println(half.toString() + middle.toString() + secondHalf.toString());
    }
}
