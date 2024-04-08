import java.util.*;
public class twod_array{
    public static void printarr(int matrix[][]){
        System.out.println("ENTERED MATRIX IS:-");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS:-");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("ENTER THE ELEMENTS IN MATRIX:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printarr(matrix);
        sc.close();
    }
}