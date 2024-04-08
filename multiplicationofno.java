import java.util.*;
public class multiplicationofno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER!!");
        int n = sc.nextInt();
        int i;
        System.out.println("TABLE OF "+n+" IS :-");
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" => "+(n*i));
        }
        sc.close();
    }
}