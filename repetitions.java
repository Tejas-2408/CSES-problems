// https://cses.fi/problemset/task/1069


import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int curr_rep=1, max_rep=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                if(max_rep<curr_rep){
                    max_rep = curr_rep;
                }
                curr_rep=1;
            }
            else{
                curr_rep+=1;
            }
        }
        if(max_rep<curr_rep){
            max_rep = curr_rep;
        }
        System.out.println(max_rep);
    }
}
