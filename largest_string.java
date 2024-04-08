import java.util.*;
public class largest_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO. OF STRINGS U WANT TO ENTER:-");
        int n= sc.nextInt();
        String st[] = new String[n+1];
        System.out.println("ENTER STRINGS:-");
        for(int i=0;i<st.length;i++){
            st[i]=sc.nextLine();
        }
        String largest = st[0];
        for(int i=1;i<st.length;i++){
        if(largest.compareTo(st[i])<0){
            largest = st[i];
        }
    }
    System.out.println("LARGEST IS :-"+largest);
    }
}