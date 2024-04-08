import java.util.*;
public class clear_rangeofbits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        System.out.println("Enter the ranges of i and j :-");
        int i = sc.nextInt();
        int j= sc.nextInt();
        int a=((~0)<<j+1);
        int b =(1<<i)-1;
        int bitmask = a|b;
        System.out.println("Clear range of bits:-"+(n&bitmask));
    }
}