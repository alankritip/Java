import java.util.*;
public class recur_binarystring{
    public static void binary_string(int n , String str,int lastd){
        if(n==0){
            System.out.println(str);
            return;
        }
        binary_string(n-1, str+"0", lastd);
        if(lastd==0){
            binary_string(n-1, str+"1", lastd+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF PLACES:-");
        int n = sc.nextInt();
        String st ="";
        binary_string(n,st, 0);
    }
}