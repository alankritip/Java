import java.util.*;
public class call_by_value{
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b= temp;
        System.out.println("swapped values are :- "+a);
        System.out.println(+b );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUES OF A AND B:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}