import java.util.*;
public class incometaxcalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INCOME");
        int income=sc.nextInt();
        float tax;
        if(income < 500000){
            tax=(0.0f*income);
            System.out.println("tax is"+tax);
        } else if(income>=500000 && income<1000000){
            tax=(0.02f*income);
            System.out.println("tax is"+tax);
        }else{
            tax=(0.03f*income);
            System.out.println("tax is"+tax);
        }
        sc.close();
    }
}