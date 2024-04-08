import java.util.*;
public class sumof_diagonal{
    public static void diagonal_sum(int ar[][]){
        int s1=0,s2=0;
        System.out.println("RIGHT DIAGONAL:-");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(i==j){
                System.out.print(ar[i][j]+" , ");
                s1=s1+ar[i][j];
            }
             } }
             System.out.println("\nSUM IS :-"+s1); 
            
            System.out.println("\nLEFT DIAGONAL IS:-");
            for(int i=0;i<ar.length;i++){
                for(int j=0;j<ar[0].length;j++){
                    if((i+j)==ar.length-1){
                    System.out.print(ar[i][j]+",");
                    s2=s2+ar[i][j];
                }
            }
            }
            System.out.println("\nSUM IS :-"+s2); 
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO. OF ROWS AND COLUMNS:-");
    int n = sc.nextInt();
    int arr[][]=new int[n][n];
    System.out.println("ENTER ELEMENTS IN ARRAY:-");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    diagonal_sum(arr);}
}