import java.util.*;
public class oneton{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF 'N' ");
        int n = sc.nextInt();
        int i=1;
        System.out.println("NUMBERS ARE:-");
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}