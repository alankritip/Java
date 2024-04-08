import java.util.*;
public class backtrack{
    public static void fillarr(int ar[],int i,int val){
        //base case
        if(i==ar.length){
            printar(ar);
            return;
        }
        //kaam
        ar[i]=val;
        fillarr(ar, i+1,val+1);
        ar[i]=ar[i]-2;
    }
    public static void printar(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar[]=new int[6];
        fillarr(ar, 0, 1);
        printar(ar);
    }
}