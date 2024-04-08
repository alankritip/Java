import java.util.*;
public class arrayfnctn{
    public static void updated_array(int ar[]){
        System.out.println("UPDATED NUMBER:-");
        for(int i=0;i<ar.length;i++){
            ar[i]=ar[i]+1;
        }
    }
    public static void print(int a[]) {
        updated_array(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER size OF ArRaY");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER NUMBER:-");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        print(arr);
    }
}