import java.util.*;
public class optimized_diagonalsum{
    public static int sumDiagonal(int ar[][]){
        int sum=0;
        for(int i=0;i<ar.length;i++){
                //primary diagonal
                sum+=ar[i][i];
                //secondary diagonal
                if(i!=ar.length-i-1){
                    sum+=ar[i][ar.length-i-1];                
                }
            }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO. OF ROWS AND COLUMNS:-");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][]=new int[n][m];
    System.out.println("ENTER ELEMENTS IN ARRAY:-");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
   int sum= sumDiagonal(arr);
   System.out.println(sum);
    }
}