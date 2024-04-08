import java.util.*;
public class reversenum{
    public static void main(String[] args) {
        /*while(n>0){
        int lastdigit = n%10;(to print the last digits) 
        System.out.print(lastdigit);
        n/=10; }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:-");
        int n = sc.nextInt();
        int rev =0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n/=10;
        }
        System.out.println("REVERSED DIGIT IS:-"+rev);
        sc.close();
    }
}