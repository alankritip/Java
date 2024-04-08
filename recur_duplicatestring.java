import java.util.*;
public class recur_duplicatestring{
    public static void remove_Duplicate(String st , int indx,StringBuilder newst,boolean bool[]){
        //base case
        if(indx==st.length()){
            System.out.println(newst);
            return;
        }
        char curr= st.charAt(indx);
        if(bool[curr-'a']==true){
            remove_Duplicate(st, indx+1, newst, bool);
        }else{
            bool[curr-'a']=true;
            remove_Duplicate(st, indx+1, newst.append(curr), bool);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING:-");
        String st = sc.next();
        remove_Duplicate(st, 0, new StringBuilder(""),new boolean[26]);
    }
}