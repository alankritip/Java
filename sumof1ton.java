import java.util.*;
public class sumof1ton{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE Of N");
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("SUM OF NATURAL NUMBERS IS:-"+sum);
        sc.close();
    }
}