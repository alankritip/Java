import java.util.*;
public class substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING :-");
        String st;
        st=sc.nextLine();
        System.out.println("ENTER STARTING INDEX:");
        int si=sc.nextInt();
        System.out.println("ENTER ENDING INDEX:");     //inbuilt-function is:- (st.substring(si,ei))
        int ei=sc.nextInt();
        String sub="";
        for(int i=si;i<ei;i++){
            sub+=st.charAt(i);
        }
        System.out.println("substring is:- "+sub);
    }
}