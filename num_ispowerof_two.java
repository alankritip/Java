import java.util.*;
public class num_ispowerof_two{
    public static boolean ispowerof_two(int n){
        //return (n&(n-1))==0;
        return (n&1)==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(ispowerof_two(n));
    }
}