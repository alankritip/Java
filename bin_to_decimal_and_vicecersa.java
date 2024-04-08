import java.util.*;
public class bin_to_decimal_and_vicecersa {
    public static void decimal_bin(int dec){
        int rem;int bin=0;int power=0;
        while(dec>0){
            rem = dec%2;
            bin = bin + rem*(int)(Math.pow(10, power));
            power++;
            dec=dec/2;
          }
          System.out.println("BINARY NUMBER IS:-"+bin);
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
        System.out.println("ENTER DECIMAL NUMBER:");
        int dec = sc.nextInt();
        decimal_bin(dec); 
        sc.close();
}
    
}
