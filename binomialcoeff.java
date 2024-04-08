import java.util.*;
public class binomialcoeff{
    public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    return f;
    }
    public static float binomial(int n, int r){
        int n_fact= factorial(n);
        int r_fact = factorial(r);
        int nminusr_fact=factorial(n-r);
        float bino = (n_fact)/(r_fact*nminusr_fact);
        return bino;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETR THE VALUE OF 'N' AND 'R':-");
        int n = sc.nextInt();
        int r = sc.nextInt();
        float bino = binomial(n, r);
        System.out.println("BINOMIAL IS:-"+bino);
        }
}