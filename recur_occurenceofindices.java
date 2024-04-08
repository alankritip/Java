import java.util.*;
public class recur_occurenceofindices{
    public static void occur_of_indices(int ar[],int i,int key){
        if(i==ar.length){
            return ;
        }
        if(ar[i]==key){
            System.out.println(i);   
        }
         occur_of_indices(ar, i+1, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("ENTER KEY:-");
        int key = sc.nextInt();
       occur_of_indices(ar, 0, key);
}    }
