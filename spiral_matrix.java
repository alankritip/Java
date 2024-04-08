import java.util.*;
public class spiral_matrix{
    public static void spiralmatrix(int ar[][]){
        int startRow=0 , startCol =0 , endRow = ar.length-1 ,endCol=ar[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(ar[startRow][j]+" , ");
            }
            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(ar[j][endCol]+" , ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(ar[endRow][j]+" , ");
            }
            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(ar[j][startCol]+" , ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
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
    spiralmatrix(arr);
}
}
