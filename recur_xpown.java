import java.util.*;
public class recur_xpown{
    public static int x_pow_n(int x,int n){
        if(n==1){
             return x;
        }
        return x*x_pow_n(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF X:-");
        int x = sc.nextInt();
        System.out.println("ENTER THE VALUE OF N:-");
        int n = sc.nextInt();
        System.out.println(x_pow_n(x, n));
    }
}