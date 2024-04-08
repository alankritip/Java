import java.util.*;
public class max_subarraysum{
    public static void maxsum_subarray(int ar[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]);
                    sum=sum+ar[k];
                }
                System.out.println();
                System.out.println("SUM IS:-"+sum);
                if(max<sum){
                    max=sum;
                }
            }

        }
        System.out.println("MAXIMUM VALUE IS:- "+max);
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
        maxsum_subarray(ar);
    }
}