import java.util.*;
public class palindromic_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE:-");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //descending
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}