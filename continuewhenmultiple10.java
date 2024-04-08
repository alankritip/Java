import java.util.*;
public class continuewhenmultiple10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        do{
            System.out.println("ENTER NUMBER:-");
            n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number is:-"+n);
        }while(true);
    }
}