import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String outcome=(marks>=33)?"PASS":"FAIL";
        System.out.println(outcome);
    }
}