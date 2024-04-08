import java.util.*;
public class recur_increasing{
    public static void increasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:-");
        int n = sc.nextInt();
        System.out.println("SERIES IS :-");
        increasing(n);
    }
}