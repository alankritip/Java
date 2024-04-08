import java.util.*;
public class hollow_rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE:-");
     int n = sc.nextInt();
     int i,j;
     for(i=1;i<=n;i++){
        for(j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(j=1;j<=n;j++){
            if(j==1||j==n||i==1||i==n){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        System.out.print(" ");
    }
        System.out.println();
    }
}}