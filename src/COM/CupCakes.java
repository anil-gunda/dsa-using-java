package COM;


import java.util.*;
public class CupCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer cakes[] = new Integer[n];
        for(int i =0; i<n; i++){
            cakes[i] = sc.nextInt();
        }

        Arrays.sort(cakes,Collections.reverseOrder());
        int res = 0;
        for(int i = 0; i<n; i++){
            res+=(int)Math.pow(2,i) * cakes[i];
        }

        System.out.println(res);

    }
}
