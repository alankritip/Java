import java.util.*;
public class butterfly{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER SIZE:-");
     int n = sc.nextInt();
     int i,j;
     //first half
     for(i=1;i<=n;i++){
        //stars
        for(j=1;j<=i;j++){
            System.out.print("*");
        }//spaces
        for(j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }//stars
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }//second half
     for(i=n;i>=1;i--){
        //stars
        for(j=1;j<=i;j++){
            System.out.print("*");
        }//spaces
        for(j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }//stars
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
     
    }
}