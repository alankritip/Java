import java.util.*;
public class recur_tilingprob{
    public static int tiling_problem(int n){ 
        if(n==0 || n==1){//if no tile or 1 tile it kept then way=1
            return 1;
        }
        // for vertical
        // int ver = tiling_problem(n-1);
        // for horizontal
        // int hor = tiling_problem(n-2);
        // return ver+hor;//total number of ways
        return tiling_problem(n-1)+tiling_problem(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:-");
        int n = sc.nextInt();
        System.out.println("NO. OF WAYS ARE:- "+tiling_problem(n));
    }
}