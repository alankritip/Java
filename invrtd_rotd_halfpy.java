import java.util.*;
public class invrtd_rotd_halfpy{
    public static void halfpy(int n){
        int i,j;
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER SIZE:-");
    int n=sc.nextInt();
    halfpy(n);
    sc.close();
}}
