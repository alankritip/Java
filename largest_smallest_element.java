import java.util.*;
public class largest_smallest_element{
    public static void search_element(int ar[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]>largest){
                    largest=ar[i][j];
                 }
                 if(ar[i][j]<smallest){
                    smallest=ar[i][j];
                 }
                }
            }
            System.out.println("LARGEST ELEMENT IS: "+largest);
                 System.out.println("SMALLEST ELEMENT IS: "+smallest);
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
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search_element(arr);
    }
}