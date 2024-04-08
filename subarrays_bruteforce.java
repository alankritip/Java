import java.util.*;
public class subarrays_bruteforce{
    public static void sub_array(int ar[]){
        System.out.println("SUB-ARRAY IS:-");
        int count=0 ,k, sum=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                for( k=i;k<=j;k++){
                System.out.print(ar[k]+" ");
                count++; sum=sum+ar[k];
            }
            System.out.println();
            System.out.println("sum of subarray is :- "+sum);
            sum=0;
            }
            System.out.println();
            }
         System.out.println();
         System.out.println("total number of sub arrays are:-"+count);
        }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n = sc.nextInt();
        int ar[]= new int [n];
        System.out.println("ENTER THE ELEMENTS:-");
        for(int i =0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        sub_array(ar);
    }
}