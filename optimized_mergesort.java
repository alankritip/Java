import java.util.*;
public class optimized_mergesort{
    public static void merge_sort(int ar[],int si,int ei){
        //base class
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        merge_sort(ar, si, mid);//left part
        merge_sort(ar, mid+1, ei);//right part
        merge(ar,si,ei,mid);
    }
    public static void merge(int ar[],int si,int ei,int mid){
        int i=si;//for left sub-array
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid&&j<=ei){
            if(ar[i]<ar[j]){
                temp[k]=ar[i];
                i++;k++;
            }else{
                temp[k]=ar[j];
                j++;k++;
            }
        }
        //for leftover elements of left part
        while(i<=mid){
            temp[k++]=ar[i++];
        }
        //for leftover elements of right part
        while(j<=ei){
            temp[k++]=ar[j++];
        }
        //copy elements to original array
        for(i=si,k=0;k<temp.length;k++,i++){
            ar[i]=temp[k];
        }
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
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        merge_sort(ar, 0, ar.length-1);
        printarr(ar);
    }
}