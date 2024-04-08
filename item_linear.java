import java.util.*;
import java.io.*;
public class item_linear{
    public static int linear_srch(String ar[],String key){
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(key)){
                return i;
            }
        }
        return -1;
     }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SIZE");
        int n = sc.nextInt();
        String arr[]=new String[n];
        System.out.println("ENTER THE ITEMS");
        for(int i =0;i<n;i++){
             arr[i]= BF.readLine();       
        }
        String key = new String();
        System.out.println("ENTER THE ITEM U HAVE TO FIND:-");
        key=BF.readLine();  
        int index = linear_srch(arr, key);
        System.out.println("element is at index"+index);
    }
}