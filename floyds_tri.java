import java.util.*;
public class floyds_tri{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE:-");
        int n = sc.nextInt();
        int i,j;
        int c=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

}