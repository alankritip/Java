import java.util.*;
public class largest_array{
    public static int largestandsmallestarr(int a[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest= Integer.MAX_VALUE;//+infinity
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
               largest=a[i];
            }
            if(smallest>a[i]){
                smallest=a[i];
             }
        }
        System.out.println("smallest number is:-"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num = largestandsmallestarr(arr);
            System.out.println("largset number is :-"+num);

    }
}