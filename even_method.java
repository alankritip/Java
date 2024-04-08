import java.util.*;
public class even_method{
    public static int isEven(int n){
        if(n%2==0){
        System.out.println("TRUE"); 
        }else{
        System.out.println("FALSE");
    }
    return n;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTE ANY NUMBER:-");
        int n = sc.nextInt();
        isEven(n);
        sc.close();
    }
}