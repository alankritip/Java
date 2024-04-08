import java.util.*;
public class fast_exponentiation{
    public static int fastexponentation(int n,int e){
        int ans = 1;
        while(e>0){
            if((n&1)!=0){
                ans = n*ans;
                n=n*n;
                e=e>>1;
            }
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("Enter the exponent");
        int exp=sc.nextInt();
        System.out.println(fastexponentation(n, exp));
    }
}