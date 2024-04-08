import java.util.*;
public class avg_method{
    public static void avg(double a,double b,double c){
       // int averg = (a+b+c)/3;
        System.out.println("AVERAGE OF NUMBER IS:-"+(a+b+c)/3d);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER THREE NUMBER:-");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        avg(a, b, c);
    }
}