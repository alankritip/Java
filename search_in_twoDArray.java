import java.util.*;
public class search_in_twoDArray{
    public static boolean search_element(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("ELEMENT IS PRESENT AT ("+i+","+j+") INDEX");
                    return true;
                }
            }
        }
        System.out.println("ELEMENT NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO. OF ROWS AND COLUMNS:-");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("ENTER ELEMENTS IN ARRAY:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER THE KEY ELEMENT:-");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search_element(arr, key);
    }
}