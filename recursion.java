import java.util.*;
public class recursion{
    public static void printDecreasing(int n){
        if(n==1){//checks if number equals 1
            System.out.println(1);
            return;//return statement in the recursive call terminates only that specific recursive call 
            //and returns control back to the calling method, allowing the execution to continue from where it left off.
            // It does not terminate the entire method or exit to the main method.
        }
        System.out.println(n);//print the value of number 
        printDecreasing(n-1);//then decrease the value by 1 
    }//when (n==1)At this point, the execution continues in reverse order, returning from one recursive call to another
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :-");
        int n = sc.nextInt();
        printDecreasing(n);
    }
}