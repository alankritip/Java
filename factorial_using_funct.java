import java.util.*;
public class factorial_using_funct{
    public static int factorialofno(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++)
        {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:-");
        int n = sc.nextInt();
        int factorial=factorialofno(n);
        System.out.println("FACTORIAL IS :-"+factorial);
        sc.close();
    }
}