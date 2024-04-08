import java.util.*;
public class recur_sortedarray{
    public static boolean sortedarray(int ar[],int i){
        if(i==ar.length-1){
            return true;
        }
        if(ar[i]>ar[i+1]){
            return false;
        }
        return sortedarray(ar, i+1);
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
        System.out.println(sortedarray(ar, 0));
    }
}