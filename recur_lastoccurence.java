import java.util.*;
public class recur_lastoccurence{
    public static int last_occur(int ar[],int key,int i){
       if(i==ar.length){
        return -1;
       }
       int m = last_occur(ar, key, i+1);
       if(m==-1 && ar[i]==key){
        return i;
       }
       return m;
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
        System.out.println(last_occur(ar, key, 0));
}
}