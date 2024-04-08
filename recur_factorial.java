import java.util.*;
public class recur_factorial{
    public static long factorial(Long n){
        if(n==2){
            return n;
        }
        long m = factorial(n-1);
        return n*m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        long n = sc.nextLong();
       System.out.println(factorial(n));
    }
}