import java.util.*;
public class recur_fibonacci{
    public static int fibonacci(int n){
        int m , k;
        if(n==0 || n==1){
        return n;
    }
     m = fibonacci(n-1);
     k = fibonacci(n-2);
     return m+k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:-");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}