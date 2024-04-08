import java.util.*;
public class backtrack_permutations{
    public static void permutations(String st ,String ans){
        if(st.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        //time complexity = o(n*n!)
        for(int i=0;i<st.length();i++){
            char cur=st.charAt(i);
            //it splits the string "abcde" if we remove c then=>"ab"+"de"which is st
            String newst=(st.substring(0, i))+(st.substring(i+1));
            permutations(newst, ans+cur);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:-");
        String st=sc.next();
        permutations(st," ");
    }
}