import java.util.*;
public class parameters_arguments{
    public static int calculate_sum(int a , int b)//formal parameters
    {// in above function name return type is integer type due to its declaration as integer in the main function
        sum= num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate_sum( a,b);//actual parameters or arguments.
        System.out.println("sum is "+sum);

    }
}