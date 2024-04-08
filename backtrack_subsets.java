import java.util.*;
public class backtrack_subsets{
    public static void subset(String st , String ans,int i){
        //base case
        if(i==st.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
            System.out.println(ans);
        }
        return;
    }
        //recursion
        //if yes
        subset(st, ans+st.charAt(i), i+1);
        //if no
        subset(st, ans, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String st = sc.next();
        subset(st, "", 0);
    }
}