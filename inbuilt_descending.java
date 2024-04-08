import java.util.*;
import java.util.Collections;//it does contain the reverseOrder()function which gives the result in descending order
public class inbuilt_descending{
    public static void printar(Integer ar[]){
        System.out.println("SORTED ELEMENTS:-");
        for(Integer i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        Integer n = sc.nextInt();
        Integer ar[]=new Integer[n];//reverse function does not work on primitive data types so "int" -> "Integers"
        System.out.println("ENTER THE ELEMENTS IN ARRAY:-");
        for(Integer i=0;i<n;i++){
            ar[i]= sc.nextInt();
        }
        // Arrays.sort(ar, Collections.reverseOrder());
        Arrays.sort(ar,0,3,Collections.reverseOrder());//it reverse the arrray upto certain index.
        printar(ar);
    }
}