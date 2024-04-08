import java.util.*;
public class postiveornegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("NUMBER IS POSITIVE");
        }else{
            System.out.println("NUMBER IS NEGATIVE");
        }
        sc.close();
    }
}
