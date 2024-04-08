import java.util.*;
public class temperaturecalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TEMPERATURE");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("YOU HAVE FEVER!!");
        }
        else{
            System.out.println("YOU DO NOT HAVE FEVER!!");
        }
    sc.close();
}
}