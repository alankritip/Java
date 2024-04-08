import java.util.*;
public class recur_optimized_xpown{
    public static int opti_xpown(int x , int n){
        if(n==1)
        {
            return x;
        }
        int m = opti_xpown(x, n/2);
        if(n%2==0){
            // return (opti_xpown(x, n/2))*(opti_xpown(x, n/2));=>if a function is called many times then its complexity increases(O(n))
            // if we store it into a variable the it will take lesser time complexity is (O(logn)).
           return  m*m;
        }
        return x*m*m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF X:-");
        int x = sc.nextInt();
        System.out.println("ENTER THE VALUE OF N:-");
        int n = sc.nextInt();
        System.out.println(opti_xpown(x, n));
    }
}