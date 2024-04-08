import java.util.*;
public class bin_to_decimal {
    public static boolean checkBinary(int bin){
        while(bin>0){
            int n = bin%10;
            if(n==0 && n==1){
                return true;
            }
            bin = bin/10;
        }
        return false;
    }
    public static void bin_decimal(int bin){
        int lastd, power=0;
        int  dec=0;   
        while(bin>0){
            lastd = bin%10;
            dec = dec+(lastd*(int)(Math.pow(2,power)));
            power++;
            bin=bin/10;
        }
        System.out.println("DECIMAL NUMBER IS:-"+dec);
        
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER BINARY NUMBER:-");
        int bin = sc.nextInt();
        bin_decimal(bin); 
        sc.close();
}
    
}
