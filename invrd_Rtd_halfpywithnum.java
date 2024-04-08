import java.util.*;
public class invrd_Rtd_halfpywithnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE:-");
        int n = sc.nextInt();
        int i,j; 
        //int c=n;
        for(i=1;i<=n;i++){
           // for(j=1;j<c+1;j++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
           // c--;
            System.out.println();
        }
    }
}