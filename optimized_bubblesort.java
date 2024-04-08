import java.util.*;
public class optimized_bubblesort{
    public static void optimisedbubble(int ar[]){
        int i,j,temp=0;
        for(i=0;i<ar.length-1;i++){
            int swaps=0;
            for(j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    swaps++;
                }
             }
             if(swaps==0){
                System.out.println("ALREADY SORTED ARRAY");
                break;
            }
        }
    }
    public static void printarr(int ar[]){
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
            ar[i]= sc.nextInt();
        }
        optimisedbubble(ar);
        printarr(ar);
     }
}