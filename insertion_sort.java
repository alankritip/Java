import java.util.*;
public class insertion_sort{
    public static void insertion(int ar[]){
        int i,j,current=0,previous=0;
        for(i=1;i<ar.length;i++){
            current = ar[i];
            previous=i-1;
            // finding out correct position to insert elements
            while(previous>=0 && ar[previous]>current){
                ar[previous+1]=ar[previous];
                previous--;
            }
            // insertion
            ar[previous+1]=current;
        }
    }
    public static void printar(int ar[]){
        System.out.println("SORTED ELEMENTS:-");
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
        insertion(ar);
        printar(ar);
    }
}