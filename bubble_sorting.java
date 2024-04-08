import java.util.*;
public class bubble_sorting{
    public static void bubble_sort(int ar[]){
        int i,j,temp=0;
        for(i=0;i<ar.length-1;i++){
            for(j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
            }
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
        int n= sc.nextInt();
        int ar[] = new int [n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        bubble_sort(ar);
        printarr(ar);
    }
}