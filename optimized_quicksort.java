import java.util.*;
public class optimized_quicksort{
    public static void quick_sort(int ar[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pivindex=partition(ar,si,ei);
        quick_sort(ar, si, pivindex-1);//left
        quick_sort(ar, pivindex+1, ei);//right
    }
    public static int partition(int ar[],int si,int ei){
        int pivot = ar[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(ar[j]<= pivot){
                i++;
                //swap
                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        ar[ei]=ar[i];
        ar[i]=temp;
         return i;
    }
    public static void printarr(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int ar[]= new int[n];
        System.out.println("ENTer THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        quick_sort(ar, 0, ar.length-1);
        printarr(ar);
    }
}