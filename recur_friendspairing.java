import java.util.*;
public class recur_friendspairing{
    public static int friend_pairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //single
        // int sing= friend_pairing(n-1);
        //pair
        // int pair =friend_pairing(n-1)*friend_pairing(n-2);
        // return sing+pair;
        return friend_pairing(n-1)+(n-1)*friend_pairing(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:-");
        int n = sc.nextInt();
        System.out.println(friend_pairing(n));
    }
}