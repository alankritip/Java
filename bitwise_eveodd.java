import java.util.*;
public class bitwise_eveodd{
    public static void evenodd(int n){
        int bitmask=1;
        if((n & bitmask) == 1){
            System.out.println("ODD NUMBER.");
        }else{
            System.out.println("EVEN NUMBER.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:-");
        int n = sc.nextInt();
        evenodd(n);
    }
}