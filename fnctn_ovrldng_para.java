import java.util.*;
public class fnctn_ovrldng_para{
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 7, 9));
    }
}