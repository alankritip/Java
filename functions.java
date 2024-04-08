import java.util.*;
public class functions{
    public static void printhello(){/*instead we will write  the return type of our output "int printhello()", 
                                       then it will return an integer value like "return 2;" */
        System.out.println("HELLO WORLD");
        }
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBERS!");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        sum = a+b;
        System.out.println("SUM IS:-"+sum);
    }
    public static void main(String[] args) {//main is function where it is of void type means it will not return any value
        printhello();//function calling;
        calculatesum();
        }
}