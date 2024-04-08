import java.util.*;
public class pairs_in_array{
    public static void pairs(int ar[]){
        System.out.println("PAIRS ARE:-");
        int total_pairs=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                System.out.print("("+ar[i]+","+ar[j]+")"+" ");total_pairs++;
             }
             System.out.println();
        }
        System.out.println("TOTAL NUMBER OF PAIRS ARE:"+total_pairs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n = sc.nextInt();
        int ar[]= new int[n];
        System.out.println("ENTER THE ARRAY:");
        for(int i =0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        pairs(ar);
        
    }
}