import java.util.*;
public class selection_sort{
    public static void selectionsort(int ar[]){
        int min;
        for(int i=0;i<ar.length-1;i++){
            min=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min=j;
                }
            }
            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }
    }
    public static void printarr(int ar[]){
        System.out.println("SORTED ARRAY:-");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        selectionsort(ar);
        printarr(ar);
    }
}