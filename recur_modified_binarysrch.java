import java.util.*;
public class recur_modified_binarysrch{
    public static int search_array(int ar[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        //kaam
        int mid=(si+(ei-si)/2);//find out the middle element
        //check if key is present at mid
        if(ar[mid]==key){
            return mid;
        }
        //check if key is on line1
        if(ar[si]<=ar[mid]){
            //case a=> if present on left side of mid in line1
            if(ar[si]<=key&&key<=ar[mid]){
                return search_array(ar, key, si, mid-1);
            }else{
                //case b=> if present on the right side of line1
                return search_array(ar, key, mid+1, ei);
            }
        }
        //if key is on line 2 
        else{
            //case d=> if present on right side of line 2
            if(ar[mid]<=key&&key<=ar[ei]){
                return search_array(ar, key, mid+1, ei);
            }else{
                return search_array(ar, key, si, mid-1);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:-");
        int n = sc.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ELEMENTS IN ARRAY");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the key element:-");
        int key=sc.nextInt();
        System.out.println("TARGET INDEX IS:- "+search_array(ar, key, 0, ar.length-1));
    }
}