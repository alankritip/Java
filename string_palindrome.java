import java.util.*;
public class string_palindrome{
public static boolean Check_palindrome(String st){
    for(int i=0;i<st.length()/2;i++){
        if(st.charAt(i)!=st.charAt(st.length()-1-i)){
            return false;
        }  
    }
    return true;
}                         //COMPLEXITY IS O(N);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:-");
        String st ;
        st=sc.nextLine();
        System.out.println(Check_palindrome(st));
    }
}