import java.util.*;
public class recur_firstocurrence{
    public static int first_occurence(int ar[],int key,int i){
        if(ar[i]==key)
        {
            return i;
        }
        if(i==ar.length-1){
            return -1;
        }
        return first_occurence(ar,key,i+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:=>");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("ENTER THE KEY ELEMENT:-");
        int key = sc.nextInt();
        System.out.println("ELEMENT IS PRESENT AT "+first_occurence(ar, key,0)+" th index");
    }
}