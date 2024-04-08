import java.util.*;
public class staircase_search{
    public static boolean staircasesearch(int ar[][],int key){
        int Row=0,Col=ar[0].length-1;
       while(Row<=ar.length && Col>=0 ){
        if(ar[Row][Col]==key){
            System.out.println("ELEMENT IS AT "+Row+","+Col+" INDEX");
            return true;
        }
        else if (key<ar[Row][Col]){
            Col--;
        }
        else{
            Row++;
        }
    }
    System.out.println("KEY NOT FOUND");
    return false;
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
    System.out.println("ENTER THE KEY ELEMENT:-");
    int key = sc.nextInt();
    staircasesearch(arr,key);
}}