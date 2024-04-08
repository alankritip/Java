import java.util.*;
public class product_of_no{
    public static int product(int a,int b){
       int  multiple = a*b;
       return multiple;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUES OF 'A' AND 'B' :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiple = product(a,b);
        System.out.println("PRODUCT IS :-"+multiple);
        }
}