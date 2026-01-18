// https://cses.fi/problemset/task/1622

import java.util.Scanner;

public class CreateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        stringComb("",s,sb);
        System.out.println(sb);
    }

    public static void stringComb(String p, String up, StringBuilder sb){
        if(up.isEmpty()){
            sb.append(p).append("\n");
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i < p.length(); i++){
            String s = p.substring(0,i);
            String e = p.substring(i,0);
            stringComb(s+ch+e,up.substring(1),sb);
        }
    }
}
