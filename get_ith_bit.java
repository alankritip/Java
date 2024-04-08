import java.util.*;

import javax.swing.SpringLayout;
public class get_ith_bit{
    public static int get_ithbit(int n , int i){
        int bitmask=1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
        
    }
    public static int set_ithbit(int n , int i){
        int bitmask = 1<<i;
        return (n|bitmask);
    }
    public static int clear_ithbit(int n , int i){
        int bitmask= ~(1<<i);
        return (n&bitmask);
    }
    public static int update_ithbit(int n,int i,int newbit){
        if(newbit==0){
            return clear_ithbit(n, i);
        }else{
            return set_ithbit(n, i);
        }
        // n = clear_ithbit(n,i);
        // int bitmask = newbit<<i;
        // return n|bitmask;
    }
    public static int clear_lastith_bits(int n ,int i){
        int bitmask=((~0)<<i);// or (-1<<i)
        return (n & bitmask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        System.out.println("Enter the i'th bit:-");
        int i = sc.nextInt();
        System.out.println("Enter new bit:-");
        int newbit =sc.nextInt();
        System.out.println("GET I'th BIT:- "+get_ithbit(n, i));
        System.out.println("SET I'th BIT:- "+set_ithbit(n, i));
        System.out.println("CLEAR I'th BIT:- "+clear_ithbit(n, i));
        System.out.println("UPDATED I'th BIT:- "+update_ithbit(n, i, newbit));
        System.out.println("CLEAR LAST I'th BITS:- "+clear_lastith_bits(n, i));
    }
}