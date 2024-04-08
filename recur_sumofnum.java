import java.util.*;
public class recur_sumofnum{
    public static int sumofnum(int n){
        if(n==1){
            return n;
        }
        int sum = sumofnum(n-1);
        return sum+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NATURAL NUMBER:-");
        int n = sc.nextInt();
        System.out.println(sumofnum(n));
    }
}