import java.util.*;
public class recur_coin{
    public static int no_of_ways(int n,int a,String st){
        if(n==0){
            return 0;
        }
        no_of_ways(n-1,a,);
        return a*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO. oF COINS:-");
        int n = sc.nextInt();
        System.out.println("NO. OF WAYS ARE:-"+no_of_ways(n, 2));
    }
}