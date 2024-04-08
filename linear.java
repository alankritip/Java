import java.util.*;
public class linear{
    public static int linear_srch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            } }
            return -1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS IN THE ARRAY:-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT U WANT TO SEARCH");
        int key=sc.nextInt();
        int index = linear_srch(arr, key);
        if(index==-1){
            System.out.println("ELEMENT NOT FOUND!!");
        }else{
            System.out.println("ELEMENT IS AT "+index+" INDEX!");
        }
    }
}