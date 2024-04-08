import java.util.*;
public class palin_method{
    public static int isPlaindrome(int n){
        int n1=n;
        int lastd,rev=0;
        while(n1>0){
            lastd=n1%10;
            rev=rev*10+lastd;
            n1/=10;
        }
        if(rev==n){
            System.out.println("NUMBER IS PALINDROME");
        }else{
            System.out.println("NUMBER IS NOT PALINDROME");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:-");
        int num = sc.nextInt();
        isPlaindrome(num);
    }
}