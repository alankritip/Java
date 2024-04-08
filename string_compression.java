import java.util.*;
public class string_compression{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int c=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                c++;i++;
            }
            sb.append(str.charAt(i));
            if(c>1){
                sb.append(c);
            }
        }
        return sb.toString(); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:-");
        String st=sc.nextLine();
        String compresed = compress(st);
        System.out.println(compresed);
    }
}