import java.util.*;
public class p{
    public static void reverse(int arr[]){
        int temp;
        int beg=0,end=arr.length-1;
        while(beg<end){
            temp=end;
            end=beg;
            beg=temp;
            beg++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i =0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        reverse(ar);
        System.out.println("REVERSED ARRAY IS:");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
         }
         }
        }
        


