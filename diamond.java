import java.util.*;
public class diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE:-");
        int n = sc.nextInt();
        int i,j;
        //first half
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(i=n;i>=1;i--){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }//stars
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


