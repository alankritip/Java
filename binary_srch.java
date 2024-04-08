import java.util.*;
public class binary_srch{
    public static int binary_search(int a[],int key){
            int start=a[0],end = a.length-1;
            while(start<=end){
                int mid= (start+end)/2;
                if(a[mid]==key){//found
                    return mid;
                }
                if(a[mid]<key){//right
                    start = mid+1;
                }else{
                    end=mid-1;//left
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("ENTER THE ELEMENTS:-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE KEY ELEMENT:-");
        int key = sc.nextInt();
        int found= binary_search(arr, key);
        System.out.println("NUMBER IS AT INDEX : " +found);
    }
}