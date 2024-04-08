import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, c = 0;
        for (i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                c++;
            }
           
        }
        if (c == 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
        sc.close();
    }
    
}