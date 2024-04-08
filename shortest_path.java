import java.util.*;
public class shortest_path{
    public static void find_path(String st){
        char ch; double x=0,y=0;
        for(int i=0;i<st.length();i++){
            ch=st.charAt(i);
            if(ch=='N'){
               y++; 
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }   
            }
        System.out.println("(x="+x+","+"y="+y+")");
        double path= ((Math.sqrt(Math.pow(x, 2)+(Math.pow(y,2)))));
        System.out.println("SHORTEST PATH IS:-"+path);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:_");
        String st;
        st=sc.nextLine();
        find_path(st);
    }
}