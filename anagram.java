import java.util.*;
public class anagram{
    public static boolean words_anagram(String st1,String st2){
        if(st1.length()==st2.length()){int i=0,j=0;
            while(i<=st1.length()-1){ 
                if(st1.charAt(i)==st2.charAt(j)){
                    i++;
                    return true;
                }
                j++;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:-");
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        System.out.println(words_anagram(st1.toLowerCase(), st2.toLowerCase()));
    }
}