import java.util.*;
public class calcusingswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A");
        int a=sc.nextInt();
        System.out.println("ENTER B");
        int b=sc.nextInt();
        System.out.println("ENTER OPERATIONS");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("wrong choice");
        }
        sc.close();
     }
}