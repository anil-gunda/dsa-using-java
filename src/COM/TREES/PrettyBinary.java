package COM.TREES;

import java.util.*;
public class PrettyBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.next();

        int i = 0;
        int res = 0;
        while( i < n-2){
            if(str.substring(i,i+3).equals("010")){
                res++;
                i+=3;
            }else{
                i++;
            }
        }

        System.out.println(res);
    }
}
