import java.util.*;
public class countingsort{
    public static void counting_sort(int ar[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            largest=Math.max(largest, ar[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<ar.length;i++){
            count[ar[i]]++;
        }
        //sorting
        int j=0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                ar[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int ar[]){
        System.out.println("SORTED ELEMENTS ARE:-");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        counting_sort(ar);
        printarr(ar);
    }
}