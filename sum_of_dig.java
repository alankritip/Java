import java.util.*;
public class sum_of_dig{
    public static int sum_digit(int num){
        int lastd,sum=0;
        while(num>0){
            lastd=num%10;
            sum=sum+lastd;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:-");
        int num=sc.nextInt();
        System.out.println("sum of digits:-"+(sum_digit(num)));
    }
}